package mx.appwhere.remittances.front.domain.entities.encryption;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Roberto Alejandro Martinez
 * @version 1.0 - 2017/10/09
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BsfOperador {
    @JsonProperty("BSFOPERADOR")
    private BsfOperadorProperties bsfOperadorProperties;

    public BsfOperadorProperties getBsfOperadorProperties() {
        return bsfOperadorProperties;
    }

    public void setBsfOperadorProperties(BsfOperadorProperties bsfOperadorProperties) {
        this.bsfOperadorProperties = bsfOperadorProperties;
    }
}
