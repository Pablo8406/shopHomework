package com.pm.shop.service;

import controler.ProductsMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CartServiceMain {

    private ProductsMethod productsMethod;


    @Autowired
    public CartServiceMain(ProductsMethod productsMethod) {
        this.productsMethod = productsMethod;
    productsMethod.showList();
    }

}
