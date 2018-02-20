package mx.appwhere.remittances.front.domain.services;

import mx.appwhere.remittances.front.application.dto.bsfoperador.BsfOperadorContainerDTO;
import mx.appwhere.remittances.front.application.dto.bsfoperador.BsfOperadorDTO;

public interface ICommonService {

    /**
     * Metodo para desencriptar una cadena de caracteres correspondiente a la estructura del bsfOperador
     * @param bsfOperadorEncriptado
     * @return
     */
	BsfOperadorDTO desencriptarBsfOperador(String bsfOperadorEncriptado);
    BsfOperadorDTO desencriptarTransport(String bsfOperadorEncriptado);
    String encriptarBsfOperador(BsfOperadorContainerDTO bsfOperadorContainerDTO);
}
