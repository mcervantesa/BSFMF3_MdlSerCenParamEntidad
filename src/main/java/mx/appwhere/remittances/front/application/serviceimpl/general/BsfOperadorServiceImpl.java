package mx.appwhere.remittances.front.application.serviceimpl.general;

import mx.appwhere.remittances.front.application.dto.bsfoperador.BsfOperadorDTO;
import mx.appwhere.remittances.front.domain.services.ConverterService;
import mx.appwhere.remittances.front.domain.entities.encryption.DecryptionResponse;
import mx.appwhere.remittances.front.domain.exceptions.BsfOperadorException;
import mx.appwhere.remittances.front.domain.exceptions.EncryptionServiceException;
import mx.appwhere.remittances.front.domain.services.encryption.EncryptionService;
import mx.appwhere.remittances.front.domain.services.general.BsfOperadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

import static mx.appwhere.remittances.front.application.constants.ApplicationConstants.*;

/**
 * @author Jenaro Bello
 * @version 1.0 - 2017/10/27
 */
@Service
public class BsfOperadorServiceImpl implements BsfOperadorService {

    private EncryptionService encryptionService;

    private ConverterService converterService;

    @Autowired
    public BsfOperadorServiceImpl(EncryptionService encryptionService, ConverterService converterService) {
        this.encryptionService = encryptionService;
        this.converterService = converterService;
    }

    @Override
    public BsfOperadorDTO decryptBsfOperador(String bsfOperador) {
        try {
            DecryptionResponse decryptionResponse = encryptionService.decryptBsfOperador(bsfOperador);
            if (Objects.isNull(decryptionResponse) || Objects.isNull(decryptionResponse.getBsfOperador())
                    || Objects.isNull(decryptionResponse.getBsfOperador().getBsfOperadorProperties())) {
                throw new BsfOperadorException(BSFOPERADOR_ERROR, CONSULTA_BSFOPERADOR_VIEW);
            }
            return converterService.convert(decryptionResponse.getBsfOperador().getBsfOperadorProperties(), BsfOperadorDTO.class);
        } catch (EncryptionServiceException ex) {
            throw new BsfOperadorException(BSFOPERADOR_ERROR, CONSULTA_BSFOPERADOR_VIEW, ex);
        }
    }
}
