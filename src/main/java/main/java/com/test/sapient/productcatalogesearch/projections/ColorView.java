package main.java.com.test.sapient.productcatalogesearch.projections;

import java.util.Set;

public interface ColorView {
    Integer getClrId();

    String getName();

    String getCode();

    Set<ProductView> getProducts();

}
