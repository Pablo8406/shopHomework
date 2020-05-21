package com.pm.shop.service;

import com.pm.shop.model.Product;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductList {
    public List<Product> productsList;

    public ProductList(){
        Product product1= new Product("Smalec",15);
        Product product2= new Product("Smalec",15);
        Product product3= new Product("Smalec",15);
        Product product4= new Product("Smalec",15);
        Product product5= new Product("Smalec",15);
    productsList = new ArrayList<>();
    productsList.add(product1);
    productsList.add(product2);
    productsList.add(product3);
    productsList.add(product4);
    productsList.add(product5);
    }
    //@EventListener(ApplicationReadyEvent.class)
    //public void getProductList(){
      //  productsList.forEach(System.out::println);
    //}

}
