package mx.appwhere.remittances.front.application.client;

import mx.appwhere.remittances.front.application.clients.req.ReqEncryptDecryptDTO;
import mx.appwhere.remittances.front.application.clients.res.ResEncryptDecryptDTO;

public interface IEncryptDecryptClient {

    /**
     * Metodo para consumir servicio encrypt de WSO2.
     * @param req
     * @return
     */
    ResEncryptDecryptDTO encrypt(ReqEncryptDecryptDTO req);

    /**
     * Metodo para consumir servicio decrypt de WSO2.
     * @param req
     * @return
     */
    ResEncryptDecryptDTO decrypt(ReqEncryptDecryptDTO req);

}
