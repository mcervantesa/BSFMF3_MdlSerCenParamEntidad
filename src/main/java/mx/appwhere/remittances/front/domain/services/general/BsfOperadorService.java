package mx.appwhere.remittances.front.domain.services.general;

import mx.appwhere.remittances.front.application.dto.bsfoperador.BsfOperadorDTO;

/**
 * @author Jenaro Bello
 * @version 1.0 - 2017/10/27
 */
public interface BsfOperadorService {
    BsfOperadorDTO decryptBsfOperador(String bsfOperador);
}
