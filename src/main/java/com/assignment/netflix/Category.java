package com.assignment.netflix;

public class Category {

    private Long id;
    private String categoryName;

    public Category(String categoryName){
        this.categoryName = categoryName;
    }

    private Category () {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
