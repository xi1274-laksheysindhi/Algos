package main.java.com.test.sapient.productcatalogesearch.controller;

import com.test.sapient.productcatalogesearch.exception.EntityNotFoundException;
import com.test.sapient.productcatalogesearch.projections.ColorView;
import com.test.sapient.productcatalogesearch.projections.ProductView;
import com.test.sapient.productcatalogesearch.service.IColorService;
import com.test.sapient.productcatalogesearch.util.RestResponse;
import com.test.sapient.productcatalogesearch.util.RestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/api/v1/color")
public class ColorController {

    @Autowired
    IColorService colorService;

    @GetMapping
    @RequestMapping("/{id}")
    public ResponseEntity<RestResponse<ColorView>> findAll(@PathVariable Integer id) throws EntityNotFoundException {
        return RestUtils.successResponse(colorService.findAllProductsByColor(id), HttpStatus.OK);
    }
}
