package main.java.com.test.sapient.productcatalogesearch.repository;

import com.test.sapient.productcatalogesearch.domain.Color;
import com.test.sapient.productcatalogesearch.projections.ColorView;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IColorRepository extends JpaRepository<Color,Integer> {
ColorView findByClrId(Integer id);
}
