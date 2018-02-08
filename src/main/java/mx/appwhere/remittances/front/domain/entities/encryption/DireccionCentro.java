package mx.appwhere.remittances.front.domain.entities.encryption;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Roberto Alejandro Martinez
 * @version 1.0 - 2017/10/09
 */
public class DireccionCentro {

    @JsonProperty("NOMBRE")
    private String nombre;

    @JsonProperty("FECHA_ALTA")
    private String fechaAlta;

    @JsonProperty("CALLE")
    private String calle;

    @JsonProperty("NUMEROEXT")
    private String numeroExt;

    @JsonProperty("COLONIA")
    private String colonia;

    @JsonProperty("CP")
    private String cp;

    // setters & getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumeroExt() {
        return numeroExt;
    }

    public void setNumeroExt(String numeroExt) {
        this.numeroExt = numeroExt;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }
}
