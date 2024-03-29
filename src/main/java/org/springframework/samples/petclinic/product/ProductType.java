package org.springframework.samples.petclinic.product;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="ProductType")
public class ProductType{
    @Id
    Integer id;
    
    @NotEmpty
    @Size(min=3 ,max=50)
    String name;
}
