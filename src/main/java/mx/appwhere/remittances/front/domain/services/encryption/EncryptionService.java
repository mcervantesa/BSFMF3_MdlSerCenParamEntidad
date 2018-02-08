package mx.appwhere.remittances.front.domain.services.encryption;

import mx.appwhere.remittances.front.domain.entities.encryption.BsfOperador;
import mx.appwhere.remittances.front.domain.entities.encryption.DecryptionResponse;
import mx.appwhere.remittances.front.domain.entities.encryption.EncryptionResponse;

/**
 * @author Roberto Alejandro Martinez
 * @version 1.0 - 2017/10/09
 */
public interface EncryptionService {
    DecryptionResponse decryptBsfOperador(String encryptedBsfOperador);

    EncryptionResponse encryptBsfOperador(BsfOperador bsfOperador);
}
