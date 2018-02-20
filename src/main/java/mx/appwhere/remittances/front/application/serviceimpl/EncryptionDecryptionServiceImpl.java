package mx.appwhere.remittances.front.application.serviceimpl;

import mx.appwhere.remittances.front.application.constants.messages.ServiceMessages;
import mx.appwhere.remittances.front.application.dtoBackend.encryptionDecryption.EncryptionDecryptionResponseDto;
import mx.appwhere.remittances.front.application.dtoBackend.encryptionDecryption.EncryptionDecryptionRequestDto;
import mx.appwhere.remittances.front.domain.constants.DomainError;
import mx.appwhere.remittances.front.domain.exceptions.AplicationServiceException;
import mx.appwhere.remittances.front.domain.exceptions.ConnectionException;
import mx.appwhere.remittances.front.domain.exceptions.RestResponseException;
import mx.appwhere.remittances.front.domain.services.EncryptionDecryptionService;
import mx.appwhere.remittances.front.domain.util.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Objects;

@Service
public class EncryptionDecryptionServiceImpl implements EncryptionDecryptionService {

    @Value("${wso2.esb.wsBsfOperacionesSucursales.encrypt}")
    private String uriEncrypt;
    @Value("${wso2.esb.wsBsfOperacionesSucursales.decrypt}")
    private String uriDecrypt;

    private RestClient restClient;

    /**
     * Inyeccion de dependencias
     */
    @Autowired
    public void setRestClient(RestClient restClient) {
        this.restClient = restClient;
    }

    /**
     * Metodo cliente para encriptar
     *
     * @param textToEncrypt {@link String}
     * @return {@link EncryptionDecryptionResponseDto}
     */
    @Override
    public EncryptionDecryptionResponseDto encrypt(String textToEncrypt) {
        try {
            UriComponents uriComponents = UriComponentsBuilder.fromUriString(this.uriEncrypt).build();
            return restClient.post(
                    uriComponents,
                    new EncryptionDecryptionRequestDto(textToEncrypt),
                    EncryptionDecryptionResponseDto.class);
        } catch (RestResponseException ex) {
            ex.getApiError().ifPresent(apiError -> {
                if (Objects.nonNull(apiError.getErrorCode())) {
                    DomainError.getDomainError(apiError.getErrorCode()).ifPresent(domainError -> {
                        if (domainError.equals(DomainError.ESB_ERROR)) {
                            throw new AplicationServiceException(
                                    ServiceMessages.ESB_ERROR);
                        }
                    });
                }
            });
            throw new ConnectionException(ServiceMessages.CONNECTION_ERROR);
        }
    }

    /**
     * Metodo cliente para desencriptar
     *
     * @param textToDecrypt {@link String}
     * @return {@link EncryptionDecryptionResponseDto}
     */
    @Override
    public EncryptionDecryptionResponseDto decrypt(String textToDecrypt) {
        try {
            UriComponents uriComponents = UriComponentsBuilder.fromUriString(this.uriDecrypt).build();
            return restClient.post(
                    uriComponents,
                    new EncryptionDecryptionRequestDto(textToDecrypt),
                    EncryptionDecryptionResponseDto.class);
        } catch (RestResponseException ex) {
            ex.getApiError().ifPresent(apiError -> {
                if (Objects.nonNull(apiError.getErrorCode())) {
                    DomainError.getDomainError(apiError.getErrorCode()).ifPresent(domainError -> {
                        if (domainError.equals(DomainError.ESB_ERROR)) {
                            throw new AplicationServiceException(
                                    ServiceMessages.ESB_ERROR);
                        }
                    });
                }
            });
            throw new ConnectionException(ServiceMessages.CONNECTION_ERROR);
        }
    }

}
