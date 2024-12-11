package com.pluralsight.NorthwindTradersAPI4.controllers;

import com.pluralsight.NorthwindTradersAPI4.dao.interfaces.IProductDao;
import com.pluralsight.NorthwindTradersAPI4.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {

    private final IProductDao productDao;

    @Autowired
    public ProductsController(IProductDao productDao) {
        this.productDao = productDao;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productDao.getAll();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        return productDao.getById(id);
    }

    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product createdProduct = productDao.insert(product);
        return ResponseEntity.ok(createdProduct);
    }
}
