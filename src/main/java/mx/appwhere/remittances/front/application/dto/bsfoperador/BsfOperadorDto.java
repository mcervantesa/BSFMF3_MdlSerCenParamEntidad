package mx.appwhere.remittances.front.application.dto.bsfoperador;

import mx.appwhere.remittances.front.application.dto.bsfoperador.DireccionCentroDto;
import mx.appwhere.remittances.front.application.dto.bsfoperador.TransportDto;

/**
 * @author Jenaro Bello
 * @version 1.0 - 2017/10/27
 */
public class BsfOperadorDto {
    private String entidad;

    private String centro;

    private String terminal;

    private String usertcb;

    private String sessionId;

    private String passtcb;

    private String nombreEmpleado;

    private String nombreCentro;

    private String fechaContable;

    private DireccionCentroDto direccionCentro;

    private TransportDto transport;

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

    public DireccionCentroDto getDireccionCentro() {
        return direccionCentro;
    }

    public void setDireccionCentro(DireccionCentroDto direccionCentro) {
        this.direccionCentro = direccionCentro;
    }

    public TransportDto getTransport() {
        return transport;
    }

    public void setTransport(TransportDto transport) {
        this.transport = transport;
    }
}
