package mx.appwhere.remittances.front.application.clients.req;

public class ReqEncryptDecryptDTO {

    private String text;

	public ReqEncryptDecryptDTO(String bsfOperadorEncriptado) {
		this.text = bsfOperadorEncriptado;
	}
	
	public ReqEncryptDecryptDTO() {
		
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
    
}
