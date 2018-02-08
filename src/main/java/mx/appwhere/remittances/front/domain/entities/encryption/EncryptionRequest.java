package mx.appwhere.remittances.front.domain.entities.encryption;

/**
 * @author Roberto Alejandro Martinez
 * @version 1.0 - 2017/10/09
 */
public class EncryptionRequest {
    private String text;

    public EncryptionRequest(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}

