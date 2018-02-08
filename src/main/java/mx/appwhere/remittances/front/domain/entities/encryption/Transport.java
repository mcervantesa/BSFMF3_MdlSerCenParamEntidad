package mx.appwhere.remittances.front.domain.entities.encryption;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Roberto Alejandro Martinez
 * @version 1.0 - 2017/10/09
 */
public class Transport {

    @JsonProperty("menuDinamico")
    private String menuDinamico;

    public String getMenuDinamico() {
        return menuDinamico;
    }

    public void setMenuDinamico(String menuDinamico) {
        this.menuDinamico = menuDinamico;
    }
}
