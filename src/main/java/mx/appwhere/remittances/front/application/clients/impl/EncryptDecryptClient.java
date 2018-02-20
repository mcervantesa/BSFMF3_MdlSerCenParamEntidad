package mx.appwhere.remittances.front.application.clients.impl;

import mx.appwhere.remittances.front.application.client.IEncryptDecryptClient;
import mx.appwhere.remittances.front.application.clients.req.ReqEncryptDecryptDTO;
import mx.appwhere.remittances.front.application.clients.res.ResEncryptDecryptDTO;
import mx.appwhere.remittances.front.application.util.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EncryptDecryptClient implements IEncryptDecryptClient {

    /*
     * Definicion de variables de clase.
     */
    private static final Logger LOGGER = LogManager.getLogger(EncryptDecryptClient.class);
    private Util util;
    private String encrypt;
    private String decrypt;
    private String servicioInaccesible;

    /**
     * Constructor para inicializar variables de clase con valores tomados del yml
     * @param encrypt
     * @param decrypt
     */
    public EncryptDecryptClient(
    		@Value("${wso2.esb.wsBsfOperacionesSucursales.encrypt}") String encrypt,
    		@Value("${wso2.esb.wsBsfOperacionesSucursales.decrypt}") String decrypt) {
        this.encrypt = encrypt;
        this.decrypt = decrypt;
        this.servicioInaccesible = "Alg\\u00FAn servicio est\\u00E1 inaccesible, contacte al administrador.";
    }

    /*
     * Inyeccion de dependencias.
     */

    /**
     * Set para inyectar dependencia util.
     * @param util
     */
    @Autowired
    public void setUtil(Util util) {
        this.util = util;
    }

    /**
     * Metodo para consumir servicio encrypt de WSO2.
     * @param req
     * @return
     */
    @Override
    public ResEncryptDecryptDTO encrypt(ReqEncryptDecryptDTO req) {
        ResEncryptDecryptDTO res = null;
        try {
            String jsonRes = this.util.callRestPost(req, this.encrypt);
            res = new ResEncryptDecryptDTO();

            if (!jsonRes.equals("")) {
                res = (ResEncryptDecryptDTO) this.util.jsonToObject(res, jsonRes);
            } else {
                res.setCodRet(-1);
                res.setError(this.servicioInaccesible);
            }

        } catch (ParseException ex) {
            LOGGER.error(ex.getStackTrace());
        }
        return res;
    }

    /**
     * Metodo para consumir servicio decrypt de WSO2.
     * @param req
     * @return
     */
    @Override
    public ResEncryptDecryptDTO decrypt(ReqEncryptDecryptDTO req) {
        ResEncryptDecryptDTO res = null;
        try {
            String jsonRes = this.util.callRestPost(req,this.decrypt);
            res = new ResEncryptDecryptDTO();

            if (!jsonRes.equals("")) {
                res = (ResEncryptDecryptDTO) this.util.jsonToObject(res, jsonRes);
            } else {
                res.setCodRet(-1);
                res.setError(this.servicioInaccesible);
            }

        } catch (ParseException ex) {
            LOGGER.error(ex.getStackTrace());
        }
        return res;
    }

}
