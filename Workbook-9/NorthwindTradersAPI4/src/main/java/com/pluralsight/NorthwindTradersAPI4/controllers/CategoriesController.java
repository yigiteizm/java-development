package com.pluralsight.NorthwindTradersAPI4.controllers;

import com.pluralsight.NorthwindTradersAPI4.dao.interfaces.ICategoryDao;
import com.pluralsight.NorthwindTradersAPI4.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoriesController {

    private final ICategoryDao categoryDao;

    @Autowired
    public CategoriesController(ICategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @GetMapping
    public List<Category> getAllCategories() {
        return categoryDao.getAll();
    }

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable int id) {
        return categoryDao.getById(id);
    }

    @PostMapping
    public ResponseEntity<Category> addCategory(@RequestBody Category category) {
        Category createdCategory = categoryDao.insert(category);
        return ResponseEntity.ok(createdCategory);
    }
}
