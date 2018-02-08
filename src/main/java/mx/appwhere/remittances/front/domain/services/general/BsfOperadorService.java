package mx.appwhere.remittances.front.domain.services.general;

import mx.appwhere.remittances.front.application.dto.bsfoperador.BsfOperadorDto;

/**
 * @author Jenaro Bello
 * @version 1.0 - 2017/10/27
 */
public interface BsfOperadorService {
    BsfOperadorDto decryptBsfOperador(String bsfOperador);
}
