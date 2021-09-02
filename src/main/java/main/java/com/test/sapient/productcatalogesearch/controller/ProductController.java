package main.java.com.test.sapient.productcatalogesearch.controller;

import com.test.sapient.productcatalogesearch.domain.Product;
import com.test.sapient.productcatalogesearch.exception.EntityNotFoundException;
import com.test.sapient.productcatalogesearch.service.IProductService;
import com.test.sapient.productcatalogesearch.util.RestResponse;
import com.test.sapient.productcatalogesearch.util.RestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    IProductService productService;

    @GetMapping
    public ResponseEntity<RestResponse<List<Product>>> findAll() throws EntityNotFoundException {
        return RestUtils.successResponse(productService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public void createData() throws EntityNotFoundException {
        productService.createData();
    }


    @GetMapping("/filter/{field}/{value}")
    public ResponseEntity<RestResponse<List<Product>>> getProducts(@PathVariable String field,
                                                                   @PathVariable String value) {
        return RestUtils.successResponse(productService.getProducts(field, value), HttpStatus.OK);
    }
}
