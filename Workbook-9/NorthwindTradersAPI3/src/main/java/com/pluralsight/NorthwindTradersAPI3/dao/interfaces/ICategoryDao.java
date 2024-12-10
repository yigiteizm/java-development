package com.pluralsight.NorthwindTradersAPI3.dao.interfaces;

import com.pluralsight.NorthwindTradersAPI3.models.Category;
import java.util.List;

public interface ICategoryDao {

    Category insert(Category category);

    List<Category> getAll();

    Category getById(int categoryId);

    void update(int categoryId, Category category);

    void delete(int categoryId);
}