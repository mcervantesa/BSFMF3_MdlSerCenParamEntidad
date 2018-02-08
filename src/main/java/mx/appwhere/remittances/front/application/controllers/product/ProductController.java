package mx.appwhere.remittances.front.application.controllers.product;

import mx.appwhere.remittances.front.application.dto.product.ProductDto;
import mx.appwhere.remittances.front.domain.services.ConverterService;
import mx.appwhere.remittances.front.domain.entities.product.Product;
import mx.appwhere.remittances.front.domain.services.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author Alejandro Martin
 * @version 1.0 - 2017/10/06
 */
@Controller
@RequestMapping("/products")
public class ProductController {
    /**
     * Entity service
     */
    private ProductService productService;

    /**
     * Converter service
     */
    private ConverterService converterService;

    @Autowired
    public ProductController(ProductService productService, ConverterService converterService) {
        this.productService = productService;
        this.converterService = converterService;
    }

    /**
     * Return view with the list of specified entities.
     *
     * @param model Model of the view
     * @return name of the view
     */
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getProducts(Model model) {
        model.addAttribute("productsDto",
                converterService.getListOfConvertedObjects(productService.getAll(),
                        Product.class, ProductDto.class)
        );
        return "products/products-list";
    }

    @PostMapping("/list")
    @ResponseStatus(HttpStatus.OK)
    public String getProductss(Model model) {
        model.addAttribute("productsDto",
                converterService.getListOfConvertedObjects(productService.getAll(),
                        Product.class, ProductDto.class)
        );
        return "products/products-list";
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String getProduct(Model model, @PathVariable Long id) {
        model.addAttribute("productDto",
                converterService.convert(productService.getById(id), ProductDto.class));
        return "products/products-show";
    }

    /**
     * Return new view with register form
     *
     * @param model view model
     * @return name of the view for the creation
     */
    @GetMapping("/new")
    @ResponseStatus(HttpStatus.OK)
    public String newProduct(Model model) {
        model.addAttribute("productDto", new ProductDto());
        return "products/products-new";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createProduct(@Valid  ProductDto productDto) {
        Product savedProduct = productService.
                save(converterService.convert(productDto, Product.class));
        return "redirect:/products/" + savedProduct.getId();
    }

    /**
     * Return edit view with update form
     *
     * @param model view model
     * @param id    entity identifier
     * @return name of the view for the update
     */
    @GetMapping("/{id}/edit")
    @ResponseStatus(HttpStatus.OK)
    public String editProduct(Model model, @PathVariable Long id) {
        model.addAttribute("productDto",
                converterService.convert(productService.getById(id), ProductDto.class));
        return "products/products-edit";
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String updateProduct(@Valid ProductDto productDto, @PathVariable Long id) {
        productDto.setId(id);
        Product savedProduct = productService.
                update(converterService.convert(productDto, Product.class));
        return "redirect:/products/" + savedProduct.getId();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteById(id);
        return "redirect:/products";
    }
}
