package org.springframework.samples.petclinic.product;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name= "Product")
public class Product{
    
    @Id
    Integer id;
    
    @NotEmpty
    @Size(min=3, max=50)
    String name;
    
    @NotEmpty
    @PositiveOrZero
    double price;
  
    @ManyToOne
    ProductType productType;

}
