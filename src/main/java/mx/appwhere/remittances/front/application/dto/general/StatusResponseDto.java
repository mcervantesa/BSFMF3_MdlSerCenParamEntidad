package mx.appwhere.remittances.front.application.dto.general;

/**
 * @author Alejandro Martin
 * @version 1.0 - 2017/11/01
 */
public class StatusResponseDto {
    private Integer status;
    private String message;

    public StatusResponseDto() {
    }

    public StatusResponseDto(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
