package mx.appwhere.remittances.front.application.converters.product;

/**
 * @author Alejandro Martin
 * @version 1.0 - 2017/10/06
 */

import mx.appwhere.remittances.front.application.converters.ConverterTest;
import mx.appwhere.remittances.front.application.dto.product.ProductDto;
import mx.appwhere.remittances.front.application.dtoBackend.product.Product;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.modelmapper.ModelMapper;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * @author Alejandro Martin
 * @version 1.0 - 2017/09/23
 */
public class ProductDtoToProductTest implements ConverterTest {
    @Spy
    private ModelMapper modelMapper;

    @InjectMocks
    private ProductDtoToProduct productDtoToProduct;

    @Before
    public void setup() {
        productDtoToProduct = new ProductDtoToProduct();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @Override
    public void testConvert() {
        ProductDto productDto = new ProductDto();
        productDto.setId(1L);
        productDto.setName("Product 1");
        productDto.setDescription("Description products 1");
        productDto.setPrice(new BigDecimal(12.99));
        productDto.setImageUrl("http://product1.com");

        // ------------- perform test ------------------
        Product product = productDtoToProduct.convert(productDto);

        assertNotNull(product);
        assertEquals(productDto.getId(), product.getId());
        assertEquals(productDto.getName(), product.getName());
        assertEquals(productDto.getDescription(), product.getDescription());
        assertEquals(productDto.getPrice(), product.getPrice());
        assertEquals(productDto.getImageUrl(), product.getImageUrl());

        verify(modelMapper, times(1)).map(productDto, Product.class);
    }
}
