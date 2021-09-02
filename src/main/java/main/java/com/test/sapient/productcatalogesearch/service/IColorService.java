package main.java.com.test.sapient.productcatalogesearch.service;

import com.test.sapient.productcatalogesearch.projections.ColorView;

import java.util.Set;

public interface IColorService {
    ColorView findAllProductsByColor(Integer id);
}
