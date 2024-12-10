package com.pluralsight.NorthwindTradersAPI2.models;

public class Category {private int categoryId;
    private String categoryName;

    // Getters ve Setters
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}