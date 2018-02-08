package mx.appwhere.remittances.front.domain.constants;

import java.util.Arrays;
import java.util.Optional;

/**
 * @author Alejandro Martin
 * @version 1.0 - 2017/09/22
 */
public enum DomainError {
    //TODO CORREGIR ESTA CLASE

    /**
     * Generic Error
     */
    ERROR(700),
    /**
     * Resource can not be found
     */
    RESOURCE_NOT_FOUND(701),
    /**
     * Resource already exists, conflict
     */
    RESOURCE_ALREADY_EXISTS(702),
    /**
     * The validation failed
     */
    VALIDATION_FAILED(703),
    /**
     * No permission to access the resource
     */
    NO_PERMISSION(704),
    /**
     * The property is null
     */
    NULL_PROPERTY(705),
    /**
     * The property is empty
     */
    EMPTY_PROPERTY(706),
    /**
     * The size of property is wrong
     */
    PROPERTY_SIZE_ERROR(707),

    /**
     * Generic "data service" error
     */
    DATA_SERVICE_ERROR(710),

    // payments

    /**
     * Data service cannot create authorization folio.
     */
    DS_CANNOT_CREATE_AUTHORIZATION_NUMBER(711),

    /**
     * Data service cannot perform payment
     */
    DS_CANNOT_COMPLETE_CASH_PAYMENT(711),

    /**
     * Data service cannot create resource
     */
    DS_CANNOT_CREATE_RESOURCE(712),

    /**
     * Data service cannot update resource
     */
    DS_CANNOT_UPDATE_RESOURCE(713),

    /**
     * This field is to mark the end of the enum.
     * NOTE: Do no use this error
     */
    SUPER_ERROR(99999);

    private Integer code;

    DomainError(Integer code) {
        this.code = code;
    }

    // setters & getters

    public Integer code() {
        return code;
    }

    /**
     * Return an {@link Optional  optional} of {@link DomainError} to corresponding {@code code}.
     *
     * @param code domain error code
     * @return domain error if it exits
     */
    public static Optional<DomainError> getDomainError(Integer code) {
        return Arrays.stream(DomainError.values())
                .filter(domainError -> domainError.code.equals(code)).findFirst();
    }
}
