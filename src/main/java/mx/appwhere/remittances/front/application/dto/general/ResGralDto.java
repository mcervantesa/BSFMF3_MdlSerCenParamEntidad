package mx.appwhere.remittances.front.application.dto.general;

/**
 * @author Jenaro Bello
 * @version 1.0 - 2017/10/11
 */
public class ResGralDto {

        private String estatus;
        private String codigo;
        private String mensaje;

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
