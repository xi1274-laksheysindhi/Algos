package main.java.com.test.sapient.productcatalogesearch.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "PCS_CLR")
@Data
@EqualsAndHashCode(of = {"id"})
@ToString
@JsonIgnoreProperties(value={"products","hibernateLazyInitializer","handler","fieldHandler"})
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer clrId;
    private String name;
    private String code;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            joinColumns = {@JoinColumn(name = "clr_id")},
            inverseJoinColumns = {@JoinColumn(name = "product_id")})
    private Set<Product> products;


}