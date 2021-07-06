package main.java.com.test.sapient.productcatalogesearch.projections;

import com.test.sapient.productcatalogesearch.domain.Brand;
import com.test.sapient.productcatalogesearch.domain.ProductCategory;

public interface ProductView {
    String getProductId();

    String getName();

    Integer getQuantity();

    String getSize();

    Brand getBrand();

    ProductCategory getProductCategory();

    double getPrice();


}
