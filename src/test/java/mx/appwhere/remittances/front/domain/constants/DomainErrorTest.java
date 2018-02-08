package mx.appwhere.remittances.front.domain.constants;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertTrue;

/**
 * @author Alejandro Martin
 * @version 1.0 - 2017/11/23
 */
public class DomainErrorTest {
    /**
     * Check for duplicate {@code code} property on {@link DomainError}.
     */
    @Test
    public void checkForDuplicateCodes() {
        Set<Integer> errorCodes = new HashSet<>();
        Arrays.stream(DomainError.values()).forEach(
                domainError -> assertTrue(
                        "Duplicated 'code' property on DomainError: " + domainError,
                        errorCodes.add(domainError.code())));
    }
}
