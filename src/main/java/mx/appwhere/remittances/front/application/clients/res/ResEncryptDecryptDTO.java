package mx.appwhere.remittances.front.application.clients.res;

public class ResEncryptDecryptDTO {

    private Integer codRet;
    private String error;
    private String respuesta;
    
    public ResEncryptDecryptDTO(Integer codRet, String error, String respuesta) {
    	this.codRet = codRet;
    	this.error = error;
    	this.respuesta = respuesta;
    }
    public ResEncryptDecryptDTO() {
    	
    }
    
    
	public Integer getCodRet() {
		return codRet;
	}
	public void setCodRet(Integer codRet) {
		this.codRet = codRet;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

}
