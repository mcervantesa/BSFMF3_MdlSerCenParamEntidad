package mx.appwhere.remittances.front.domain.services;

import mx.appwhere.remittances.front.application.dtoBackend.bsfOperador.BsfOperadorDto;

public interface BsfOperadorService {

    BsfOperadorDto decryptBsfOperador(String bsfOperadorEncrypted);

    String encryptBsfOperador(BsfOperadorDto bsfOperadorDto);

}
