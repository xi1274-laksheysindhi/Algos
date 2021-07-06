package main.java.com.test.sapient.productcatalogesearch.service.impl;

import com.test.sapient.productcatalogesearch.domain.Brand;
import com.test.sapient.productcatalogesearch.domain.Color;
import com.test.sapient.productcatalogesearch.domain.Product;
import com.test.sapient.productcatalogesearch.domain.ProductCategory;
import com.test.sapient.productcatalogesearch.exception.EntityNotFoundException;
import com.test.sapient.productcatalogesearch.repository.IProductRepository;
import com.test.sapient.productcatalogesearch.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    IProductRepository productRepository;

    @Override
    public List<Product> findAll() throws EntityNotFoundException {
        List<Product> products = productRepository.findAll();
        System.out.println(products);
        if (CollectionUtils.isEmpty(products)) {
            throw new EntityNotFoundException("Product Not avaiable");
        }
        return products;
    }

    @Override
    public List<Product> getProducts(String field, String value) {
        return null;
    }

    @Override
    @Autowired
    public void createData() {
        Product p = new Product();
        Brand b=new Brand();
        b.setName("LEE");
        p.setBrand(b);

        ProductCategory productCategory = new ProductCategory();
        productCategory.setName("JEANS");
        p.setProductCategory(productCategory);

        HashSet<Color> colors = new HashSet<>();
        Color color = new Color();
        color.setCode("RD");
        color.setName("RED");
        colors.add(color);

        p.setColors(colors);
        color.setProducts(new HashSet<>(Arrays.asList(p)));
        productRepository.save(p);
    }
}
