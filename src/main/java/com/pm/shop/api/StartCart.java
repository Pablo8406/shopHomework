package com.pm.shop.api;

import com.pm.shop.service.ProductList;
import controler.ProductsMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class StartCart implements ProductsMethod {
    ProductList productList;

    @Autowired
    public StartCart(ProductList productList) {
        this.productList = productList;
    }

    @Override
    public void showList() {
        System.out.println("StartCart");
        productList.productsList.forEach(System.out::println);

    }
}
