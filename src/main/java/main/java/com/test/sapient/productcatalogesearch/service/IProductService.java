package main.java.com.test.sapient.productcatalogesearch.service;

import com.test.sapient.productcatalogesearch.domain.Product;
import com.test.sapient.productcatalogesearch.exception.EntityNotFoundException;

import java.util.List;

public interface IProductService  {
    List<Product> findAll() throws EntityNotFoundException;

    List<Product> getProducts(String field, String value);

    void createData();
}
