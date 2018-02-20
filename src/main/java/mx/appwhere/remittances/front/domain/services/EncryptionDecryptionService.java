package mx.appwhere.remittances.front.domain.services;

import mx.appwhere.remittances.front.application.dtoBackend.encryptionDecryption.EncryptionDecryptionResponseDto;

public interface EncryptionDecryptionService {

    EncryptionDecryptionResponseDto encrypt(String textToEncrypt);
    EncryptionDecryptionResponseDto decrypt(String textToDecrypt);

}
