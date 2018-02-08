package mx.appwhere.remittances.front.domain.entities.encryption;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import mx.appwhere.remittances.front.application.deserialization.EncryptionResponseDeserializer;

/**
 * @author Roberto Alejandro Martinez
 * @version 1.0 - 2017/10/09
 */
@JsonDeserialize(using = EncryptionResponseDeserializer.class)
public class DecryptionResponse {

    @JsonProperty("codRet")
    private String codRet;

    @JsonProperty("error")
    private String error;

    @JsonProperty("respuesta")
    private BsfOperador bsfOperador;

    // setters & getters

    public String getCodRet() {
        return codRet;
    }

    public void setCodRet(String codRet) {
        this.codRet = codRet;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public BsfOperador getBsfOperador() {
        return bsfOperador;
    }

    public void setBsfOperador(BsfOperador bsfOperador) {
        this.bsfOperador = bsfOperador;
    }
}
