package mx.appwhere.remittances.front.application.converters;

import mx.appwhere.remittances.front.application.dto.bsfoperador.BsfOperadorDTO;
import mx.appwhere.remittances.front.domain.entities.encryption.BsfOperadorProperties;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @author Jenaro Bello
 * @version 1.0 - 2017/10/27
 */
@Component
public class BsfOperadorPropertiesToBsfOperadorDto extends AbstractConverter<BsfOperadorProperties, BsfOperadorDTO> {

    @Override
    public BsfOperadorDTO convert(BsfOperadorProperties bsfOperadorProperties) {
        Objects.requireNonNull(bsfOperadorProperties, "bsfOperadorProperties must not be null");
        return modelMapper.map(bsfOperadorProperties, BsfOperadorDTO.class);
    }
}
