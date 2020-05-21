package controler;

import com.pm.shop.model.Product;
import com.pm.shop.service.ProductList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {


    private ProductList productList;

    @Autowired
    public void setProductList(ProductList productList) {
        this.productList = productList;
    }


    }

