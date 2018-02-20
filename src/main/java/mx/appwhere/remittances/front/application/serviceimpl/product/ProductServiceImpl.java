package mx.appwhere.remittances.front.application.serviceimpl.product;

import mx.appwhere.remittances.front.application.dto.product.ProductDto;
import mx.appwhere.remittances.front.domain.services.ConverterService;
import mx.appwhere.remittances.front.application.util.RestClient;
import mx.appwhere.remittances.front.domain.constants.DomainConstants;
import mx.appwhere.remittances.front.domain.entities.encryption.DecryptionResponse;
import mx.appwhere.remittances.front.domain.entities.encryption.EncryptionResponse;
import mx.appwhere.remittances.front.domain.entities.product.Product;
import mx.appwhere.remittances.front.domain.exceptions.RestResponseException;
import mx.appwhere.remittances.front.domain.exceptions.ViewException;
import mx.appwhere.remittances.front.domain.services.encryption.EncryptionService;
import mx.appwhere.remittances.front.domain.services.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Arrays;
import java.util.List;

/**
 * @author Alejandro Martin
 * @version 1.0 - 2017/10/04
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Value("${remittances-back.services.products.uri}")
    private String productServiceUri;

    @Value("${remittances-back.services.payments.cash.uri}")
    private String paymentsUri;

    @Value("${remittances-back.services.remittances.uri}")
    private String foliosUri;

    private ConverterService converterService;

    private RestClient restClient;

    @Autowired
    private EncryptionService encryptionService;

    @Autowired
    public ProductServiceImpl(ConverterService converterService, RestClient restClient) {
        this.converterService = converterService;
        this.restClient = restClient;
    }

    @Override
    public List<Product> getAll() {
        /*String bsfOperador = "ig6bpA59BmxGAIwqUPcX5SRRxl3om/4vKuu6jFTBSvU5gKmGr1uJw8UtEY0a81/ln/qt7jxIHGE9hcv8i60x9thhEzA4YsHucwd5eeN2Pb2dQQBGaPefUA6knClsmrosMQhpVCijDT3Er2KciZbDE1z+mnyAI7DWRjW7CKB9vLLz80ut7FFs+F9uasYivmpEm27h3n5qM/dqSY9lM3PeVzeGwUbGfMbhGbqOCy5wlDyxPdgk/EnvkdJpOiPNwh++ywCRj7yU8qU5MAc/iCC6V3nLGWfUsi8qflhwdcAByEwXMztX7Nejv8IP/VJU1q+0GTbIYxqXzAHIAYIKlUvpQxUqmzh1oOmxImfPFc2+1zCLYenWKNzBolUFXZ/ideLB308QPayYvgpffHtApkIBC3/lSoPN0/nnz5X97XysYIGhsQeDb2ATxnZInzDLnx79fIUYo/FYZyIkGpTxiL7MofeE42xgz5IDDwezfBef/pg0yX0UEog6Skvqe7ZNnuexIwS8aD8AgclEupmz493cgp9NkVqh/YAefLxrbFe+9hXl2IHIW4PSkHICoTx8QekJDbImNCo7pNXrRFBbSTZr4TfdH+QGIJIh/zA8y5O3GVI=";
        DecryptionResponse response = encryptionService.decryptBsfOperador(bsfOperador);
        EncryptionResponse eresponse = encryptionService.encryptBsfOperador(response.getBsfOperador());
        System.out.print(eresponse.getRespuesta());

        response = encryptionService.decryptBsfOperador(eresponse.getRespuesta());
        System.out.print(response);
        // TODO
*/
        List<ProductDto> productsDto;
        try {
            UriComponents uriComponents = UriComponentsBuilder.fromUriString(productServiceUri).build();
            HttpHeaders headers = new HttpHeaders();
            headers.add(HttpHeaders.ACCEPT, DomainConstants.MEDIA_TYPE_PRIVATE_V1_JSON);
            productsDto = Arrays.asList(restClient.get(uriComponents, headers, ProductDto[].class));
        } catch (RestResponseException ex) {
            throw new ViewException("Products not found", ex);
        }
        return converterService.getListOfConvertedObjects(productsDto, ProductDto.class, Product.class);
    }

    @Override
    public Product getById(Long id) {
        ProductDto productDto;
        try {
            UriComponents uriComponents = UriComponentsBuilder.fromUriString(productServiceUri)
                    .path("/" + id).build();
            HttpHeaders headers = new HttpHeaders();
            headers.add(HttpHeaders.ACCEPT, DomainConstants.MEDIA_TYPE_PRIVATE_V1_JSON);
            productDto = restClient.get(uriComponents, headers, ProductDto.class);
        } catch (RestResponseException ex) {
            throw new ViewException("Product not found", ex);
        }
        return converterService.convert(productDto, Product.class);
    }

    @Override
    public Product save(Product product) {
        Product savedProduct;
        try {
            UriComponents uriComponents = UriComponentsBuilder.fromUriString(productServiceUri).build();
            HttpHeaders headers = new HttpHeaders();
            headers.add(HttpHeaders.ACCEPT, DomainConstants.MEDIA_TYPE_PRIVATE_V1_JSON);
            savedProduct = restClient.post(uriComponents, headers, product, Product.class);
        } catch (RestResponseException ex) {
            throw new ViewException("Cannot save product", ex);
        }
        return savedProduct;
    }

    @Override
    public Product update(Product product) {
        Product savedProduct;
        try {
            UriComponents uriComponents = UriComponentsBuilder.fromUriString(productServiceUri)
                    .path("/" + product.getId()).build();
            HttpHeaders headers = new HttpHeaders();
            headers.add(HttpHeaders.ACCEPT, DomainConstants.MEDIA_TYPE_PRIVATE_V1_JSON);
            savedProduct = restClient.put(uriComponents, headers, product, Product.class);
        } catch (RestResponseException ex) {
            throw new ViewException("Cannot update product", ex);
        }
        return savedProduct;
    }

    @Override
    public void deleteById(Long id) {
        try {
            UriComponents uriComponents = UriComponentsBuilder.fromUriString(productServiceUri)
                    .path("/" + id).build();
            HttpHeaders headers = new HttpHeaders();
            headers.add(HttpHeaders.ACCEPT, DomainConstants.MEDIA_TYPE_PRIVATE_V1_JSON);
            restClient.delete(uriComponents, headers);
        } catch (RestResponseException ex) {
            throw new ViewException("Cannot delete", ex);
        }
    }
}
