package mx.appwhere.remittances.front.application.serviceimpl.encryption;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import mx.appwhere.remittances.front.application.util.RestClient;
import mx.appwhere.remittances.front.domain.entities.encryption.BsfOperador;
import mx.appwhere.remittances.front.domain.entities.encryption.EncryptionRequest;
import mx.appwhere.remittances.front.domain.entities.encryption.DecryptionResponse;
import mx.appwhere.remittances.front.domain.entities.encryption.EncryptionResponse;
import mx.appwhere.remittances.front.domain.exceptions.EncryptionServiceException;
import mx.appwhere.remittances.front.domain.exceptions.RestResponseException;
import mx.appwhere.remittances.front.domain.services.encryption.EncryptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * @author Roberto Alejandro Martinez
 * @version 1.0 - 2017/10/09
 */
@Service
public class EncryptionServiceImpl implements EncryptionService {
    private RestClient restClient;
    private ObjectMapper objectMapper;

    @Value("${wso2.esb.wsBsfOperacionesSucursales.encrypt}")
    private String encryptionServiceUri;

    @Value("${wso2.esb.wsBsfOperacionesSucursales.decrypt}")
    private String decryptionServiceUri;

    @Autowired
    public EncryptionServiceImpl(RestClient restClient, ObjectMapper objectMapper) {
        this.restClient = restClient;
        this.objectMapper = objectMapper;
    }

    @Override
    public DecryptionResponse decryptBsfOperador(String encryptedBsfOperador) {
        try {
            UriComponents uriComponents = UriComponentsBuilder.fromUriString(decryptionServiceUri).build();
            return restClient.post(uriComponents, new HttpHeaders(), new EncryptionRequest(encryptedBsfOperador),
                    DecryptionResponse.class);
        } catch (RestResponseException ex) {
            throw new EncryptionServiceException("Cannot decrypt request", ex);
        }
    }

    @Override
    public EncryptionResponse encryptBsfOperador(BsfOperador bsfOperador) {
        try {
            UriComponents uriComponents = UriComponentsBuilder.fromUriString(encryptionServiceUri).build();
            String bsfOperadorJson = objectMapper.writeValueAsString(bsfOperador);
            return restClient.post(uriComponents, new HttpHeaders(), new EncryptionRequest(bsfOperadorJson),
                    EncryptionResponse.class);
        } catch (RestResponseException | JsonProcessingException ex) {
            throw new EncryptionServiceException("Cannot encrypt request", ex);
        }
    }
}
