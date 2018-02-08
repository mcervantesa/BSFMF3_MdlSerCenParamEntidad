package mx.appwhere.remittances.front.domain.exceptions.ajax;

import mx.appwhere.remittances.front.domain.constants.DomainError;
import mx.appwhere.remittances.front.domain.exceptions.RestResponseException;

/**
 * @author Jenaro Bello
 * @version 1.0 - 2017/11/14
 */
public class ResourceNotFoundRestAjaxException extends AjaxException {
    public ResourceNotFoundRestAjaxException(String message, DomainError domainError, Object details) {
        super(message, domainError, details);
    }

    public ResourceNotFoundRestAjaxException(String message, DomainError domainError, Object details, Throwable cause) {
        super(message, domainError, details, cause);
    }

    public ResourceNotFoundRestAjaxException(String message, DomainError domainError) {
        super(message, domainError);
    }

    public ResourceNotFoundRestAjaxException(String message, DomainError domainError, Throwable cause) {
        super(message, domainError, cause);
    }
}
