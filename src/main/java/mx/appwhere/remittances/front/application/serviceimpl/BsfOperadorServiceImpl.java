package mx.appwhere.remittances.front.application.serviceimpl;

import mx.appwhere.remittances.front.application.constants.ViewsLocation;
import mx.appwhere.remittances.front.application.constants.messages.ServiceMessages;
import mx.appwhere.remittances.front.application.dtoBackend.bsfOperador.BsfOperadorContainerDto;
import mx.appwhere.remittances.front.application.dtoBackend.bsfOperador.BsfOperadorDto;
import mx.appwhere.remittances.front.domain.exceptions.BsfOperadorException;
import mx.appwhere.remittances.front.domain.services.BsfOperadorService;
import mx.appwhere.remittances.front.domain.services.EncryptionDecryptionService;
import mx.appwhere.remittances.front.domain.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BsfOperadorServiceImpl implements BsfOperadorService {

    private EncryptionDecryptionService encryptionDecryptionService;
    private Util util;

    /**
     * Inyeccion de dependenciass
     */
    @Autowired
    public void setUtil(Util util) {
        this.util = util;
    }

    @Autowired
    public void setEncryptionDecryptionService(EncryptionDecryptionService encryptionDecryptionService) {
        this.encryptionDecryptionService = encryptionDecryptionService;
    }

    /**
     * Metodo para desencriptar bsfOperador
     *
     * @param bsfOperadorEncrypted {@link String}
     * @return {@link BsfOperadorDto}
     */
    @Override
    public BsfOperadorDto decryptBsfOperador(String bsfOperadorEncrypted) {
        String bsfOperadorJson = this.encryptionDecryptionService.decrypt(bsfOperadorEncrypted).getRespuesta();
        try {
            BsfOperadorContainerDto bsfOperadorContainerDto = new BsfOperadorContainerDto();
            bsfOperadorContainerDto =
                    (BsfOperadorContainerDto)
                            this.util.jsonToObject(bsfOperadorContainerDto,bsfOperadorJson);
            return bsfOperadorContainerDto.getBSFOPERADOR();
        } catch (Exception e) {
            throw new BsfOperadorException(ServiceMessages.BSFOPERADOR_ERROR);
        }
    }

    /**
     * Metodo para encriptar bsfOperador
     *
     * @param bsfOperadorDto {@link BsfOperadorDto}
     * @return {@link String}
     */
    @Override
    public String encryptBsfOperador(BsfOperadorDto bsfOperadorDto) {
        try {
            return this.encryptionDecryptionService.encrypt(this.util.objectToJson(bsfOperadorDto))
                    .getRespuesta();
        } catch (Exception ex) {
            throw new BsfOperadorException(ServiceMessages.BSFOPERADOR_ERROR);
        }
    }

}
