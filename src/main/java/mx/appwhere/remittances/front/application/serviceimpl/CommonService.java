package mx.appwhere.remittances.front.application.serviceimpl;

import mx.appwhere.remittances.front.application.client.IEncryptDecryptClient;
import mx.appwhere.remittances.front.application.clients.req.ReqEncryptDecryptDTO;
import mx.appwhere.remittances.front.application.clients.res.ResEncryptDecryptDTO;
import mx.appwhere.remittances.front.application.dto.bsfoperador.BsfOperadorContainerDTO;
import mx.appwhere.remittances.front.application.dto.bsfoperador.BsfOperadorDTO;
import mx.appwhere.remittances.front.application.util.Util;
import mx.appwhere.remittances.front.domain.services.ICommonService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CommonService implements ICommonService {

    /*
     * Variables de clase
     */
    private Util util;
    private IEncryptDecryptClient encryptDecryptClient;

    /*
     * Inyeccion de dependencias
     */

    /**
     * Set de dependencia Util
     * @param util
     */
    @Autowired
    public void setUtil(Util util) {
        this.util = util;
    }

    /**
     * Set de dependencia Util
     * @param encryptDecryptClient
     */
    @Autowired
    public void setEncryptDecryptClient(IEncryptDecryptClient encryptDecryptClient) {
        this.encryptDecryptClient = encryptDecryptClient;
    }

    /**
     * Metodo para desencriptar una cadena de caracteres correspondiente a la estructura del bsfOperador.
     * @param bsfOperadorEncriptado
     * @return
     */
    @Override
    public BsfOperadorDTO desencriptarBsfOperador(String bsfOperadorEncriptado) {
        ReqEncryptDecryptDTO reqEncryptDecryptDTO = new ReqEncryptDecryptDTO(bsfOperadorEncriptado);
        ResEncryptDecryptDTO resEncryptDecryptDTO = this.encryptDecryptClient.decrypt(reqEncryptDecryptDTO);
        return decrypt(resEncryptDecryptDTO.getRespuesta().replaceAll("\'","\""));
    }

    /**
     * Metodo para desencriptar una cadena de caracteres correspondiente a la estructura del TRANSPORT.
     * @param bsfOperadorEncriptado
     * @return
     */
    @Override
    public BsfOperadorDTO desencriptarTransport(String bsfOperadorEncriptado) {
        ReqEncryptDecryptDTO reqEncryptDecryptDTO = new ReqEncryptDecryptDTO(bsfOperadorEncriptado);
        ResEncryptDecryptDTO resEncryptDecryptDTO = this.encryptDecryptClient.decrypt(reqEncryptDecryptDTO);
        return decrypt(resEncryptDecryptDTO.getRespuesta().replaceAll("\'", "@AC&").replaceAll("'","\"").replaceAll("@AC&", "\\\""));
    }

    public String desencriptarIdInternoPe(String idInternoPe){
        ReqEncryptDecryptDTO reqEncryptDecryptDTO = new ReqEncryptDecryptDTO(idInternoPe);
        ResEncryptDecryptDTO resEncryptDecryptDTO = this.encryptDecryptClient.decrypt(reqEncryptDecryptDTO);
        return resEncryptDecryptDTO.getRespuesta();
    }

    private BsfOperadorDTO decrypt(String bsfOperador){
        BsfOperadorDTO bsfOperadorDTO = new BsfOperadorDTO();
        try {
            // Se transforma json a Objeto de tipo ResEncryptDecryptDTO eliminando el nodo principal "BSFOPERADOR"
            ArrayList<String> nodosEliminar = new ArrayList<String>();
            nodosEliminar.add("BSFOPERADOR");
            bsfOperadorDTO = (BsfOperadorDTO)this.util.jsonToObject(bsfOperadorDTO, bsfOperador, nodosEliminar);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return bsfOperadorDTO;
    }

    /**
     * Metodo para encriptar un bsfOperadorContainerDTO y retornar String
     * @param bsfOperadorContainerDTO
     * @return
     */
    @Override
    public String encriptarBsfOperador(BsfOperadorContainerDTO bsfOperadorContainerDTO) {
    	ReqEncryptDecryptDTO reqEncryptDecryptDTO = new ReqEncryptDecryptDTO();
    	reqEncryptDecryptDTO.setText(this.util.objectToJson(bsfOperadorContainerDTO));
    	ResEncryptDecryptDTO resEncryptDecryptDTO =  this.encryptDecryptClient.encrypt(reqEncryptDecryptDTO);
    	if (resEncryptDecryptDTO.getCodRet() == 1) {
			return resEncryptDecryptDTO.getRespuesta();
		} else {
			return "";
		}
    }
}