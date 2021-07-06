package main.java.com.test.sapient.productcatalogesearch.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.test.sapient.productcatalogesearch.config.StringPrefixedSequenceIdGenerator;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "PCS_PRODUCT_CTGR")
@Data
@EqualsAndHashCode(of = {"id"})
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_category_seq")
    @GenericGenerator(
            name = "product_category_seq",
            strategy = "com.test.sapient.productcatalogesearch.config.StringPrefixedSequenceIdGenerator",
            parameters = {
                    @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "PC_"),
                    @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d")})
    @Column(name = "PRDDUCT_CTGR_ID")
    private String id;
    private String name;



}

