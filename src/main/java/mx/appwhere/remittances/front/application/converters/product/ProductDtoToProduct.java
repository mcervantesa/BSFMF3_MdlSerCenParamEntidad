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
public class ProductDtoToProduct extends AbstractConverter<ProductDto, Product> {
    @Override
    public Product convert(ProductDto productDto) {
        Objects.requireNonNull(productDto, "ProductDto must not be null");
        return modelMapper.map(productDto, Product.class);
    }
}
