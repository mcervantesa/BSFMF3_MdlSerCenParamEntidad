package mx.appwhere.remittances.front.application.converters.product;

import mx.appwhere.remittances.front.application.converters.AbstractConverter;
import mx.appwhere.remittances.front.application.dto.product.ProductDto;
import mx.appwhere.remittances.front.domain.entities.product.Product;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @author Alejandro Martin
 * @version 1.0 - 2017/10/04
 */
@Component
public class ProductToProductDto extends AbstractConverter<Product, ProductDto> {
    @Override
    public ProductDto convert(Product product) {
        Objects.requireNonNull(product, "products must not be null");
        return modelMapper.map(product, ProductDto.class);
    }
}
