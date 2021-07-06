package main.java.com.test.sapient.productcatalogesearch.repository;

import com.test.sapient.productcatalogesearch.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product, String> {
}
