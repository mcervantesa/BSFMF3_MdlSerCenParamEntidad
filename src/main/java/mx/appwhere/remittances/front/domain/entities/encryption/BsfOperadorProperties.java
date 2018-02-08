package mx.appwhere.remittances.front.domain.entities.encryption;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Roberto Alejandro Martinez
 * @version 1.0 - 2017/10/09
 */
public class BsfOperadorProperties {

    @JsonProperty("ENTIDAD")
    private String entidad;

    @JsonProperty("CENTRO")
    private String centro;

    @JsonProperty("TERMINAL")
    private String terminal;

    @JsonProperty("USERTCB")
    private String usertcb;

    @JsonProperty("SESSIONID")
    private String sessionId;

    @JsonProperty("PASSTCB")
    private String passtcb;

    @JsonProperty("NOMBREEMPLEADO")
    private String nombreEmpleado;

    @JsonProperty("NOMBRECENTRO")
    private String nombreCentro;

    @JsonProperty("FECHACONTABLE")
    private String fechaContable;

    @JsonProperty("DIRECCIONCENTRO")
    private DireccionCentro direccionCentro;

    @JsonProperty("TRANSPORT")
    private Transport transport;

    // setters & getters

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getUsertcb() {
        return usertcb;
    }

    public void setUsertcb(String usertcb) {
        this.usertcb = usertcb;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getPasstcb() {
        return passtcb;
    }

    public void setPasstcb(String passtcb) {
        this.passtcb = passtcb;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public String getFechaContable() {
        return fechaContable;
    }

    public void setFechaContable(String fechaContable) {
        this.fechaContable = fechaContable;
    }

    public DireccionCentro getDireccionCentro() {
        return direccionCentro;
    }

    public void setDireccionCentro(DireccionCentro direccionCentro) {
        this.direccionCentro = direccionCentro;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }
}
