package com.learning.simpleWebApp.service;

import com.learning.simpleWebApp.model.Product;
import com.learning.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    /* List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone",50000),
            new Product(102,"Samsoong",30000),
            new Product(103,"Nokia",20000))
    );*/

    @Autowired
    ProductRepo repo;

    public List<Product> getProducts(){
        //return products;
        return repo.findAll();
    }


    public Product getProductById(int prodId) {
        //return products.stream().filter(p->p.getProdId()==prodId).findFirst().orElse(new Product(100, "Pata nhi",0));
        return repo.findById(prodId).orElse(new Product(000,"Kuch nhi",000));
    }

    public void addProduct(Product prod){
        //products.add(prod);
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        /*int ind = -1;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdId()==prod.getProdId()){
                ind = i;
                break;
            }
        }
        products.set(ind,prod);*/
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        /*int ind = -1;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdId()==prodId){
                ind = i;
                break;
            }
        }
        products.remove(ind);*/
        repo.deleteById(prodId);
    }
}
