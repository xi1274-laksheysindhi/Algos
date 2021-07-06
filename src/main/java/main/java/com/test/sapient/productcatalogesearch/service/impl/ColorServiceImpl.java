package main.java.com.test.sapient.productcatalogesearch.service.impl;

import com.test.sapient.productcatalogesearch.projections.ColorView;
import com.test.sapient.productcatalogesearch.projections.ProductView;
import com.test.sapient.productcatalogesearch.repository.IColorRepository;
import com.test.sapient.productcatalogesearch.service.IColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ColorServiceImpl implements IColorService {
    @Autowired
    IColorRepository colorRepository;

    @Override
    public ColorView findAllProductsByColor(Integer id) {
        ColorView byId = colorRepository.findByClrId(id);
        return byId;
    }
}
