package com.pluralsight.NorthwindTradersAPI3.controllers;

import com.pluralsight.NorthwindTradersAPI3.models.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductsController {
    private List<Product> products;

    public ProductsController() {

        products = new ArrayList<>();
        products.add(new Product(1, "Product 1", 1, 9.99));
        products.add(new Product(2, "Product 2", 2, 19.99));
        products.add(new Product(3, "Product 3", 1, 9.99));

    }

    @RequestMapping(path = "/products", method = RequestMethod.GET)
    public List<Product> getAllProducts() {
        return products;
    }


    @RequestMapping(path = "/products/{productId}", method = RequestMethod.GET)
    public Product getProductById(@PathVariable int productId) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null;
    }
}