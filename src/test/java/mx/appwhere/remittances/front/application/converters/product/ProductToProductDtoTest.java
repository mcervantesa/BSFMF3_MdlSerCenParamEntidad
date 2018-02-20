package mx.appwhere.remittances.front.application.converters.product;

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
public class ProductToProductDtoTest implements ConverterTest {

    @Spy
    private ModelMapper modelMapper;

    @InjectMocks
    private ProductToProductDto productToProductDto;

    @Before
    public void setup() {
        productToProductDto = new ProductToProductDto();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @Override
    public void testConvert() {
        Product product = new Product();
        product.setId(1L);
        product.setName("Product 1");
        product.setDescription("Description products 1");
        product.setPrice(new BigDecimal(12.99));
        product.setImageUrl("http://product1.com");

        // ------------- perform test ------------------
        ProductDto productDto = productToProductDto.convert(product);

        assertNotNull(productDto);
        assertEquals(product.getId(), productDto.getId());
        assertEquals(product.getName(), productDto.getName());
        assertEquals(product.getDescription(), productDto.getDescription());
        assertEquals(product.getPrice(), productDto.getPrice());
        assertEquals(product.getImageUrl(), productDto.getImageUrl());

        verify(modelMapper, times(1)).map(product, ProductDto.class);
    }
}
