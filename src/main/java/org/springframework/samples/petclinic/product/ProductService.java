package org.springframework.samples.petclinic.product;

import java.util.LinkedList;
import java.util.List;

public class ProductService {

    private ProductRepository productRepository;


    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public List<Product> getProductsCheaperThan(double price) {
        List<Product> res= new LinkedList<>();
        List<Product> allProducts=getAllProducts();
        for(int i=0; i<allProducts.size();i++){
            Product p= allProducts.get(i)
            if(p.getPrice()<price){
                res.add(p);
            }
        }
        return res;
    }

    public ProductType getProductType(String typeName) {
        Product p=productRepository.findByName(typeName);
        return p.getProductType();
    }

    public Product save(Product p){
        return null;       
    }

    
}
