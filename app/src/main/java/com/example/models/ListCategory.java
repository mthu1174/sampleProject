package com.example.models;

import java.io.Serializable;
import java.util.ArrayList;

public class ListCategory implements Serializable {
    private ArrayList<Category> categories;
    public ListCategory(){
        categories= new ArrayList<>();
    }
    public ListCategory(ArrayList<Category>categories){
        this.categories=categories;
    }
    public ArrayList<Category> getCategories(){
        return categories;
    }
    public void setCategories(ArrayList<Category>categories){
        this.categories=categories;
    }
    public void addCategory(Category ca){
        categories.add(ca);
    }
    public void generateSampleData(){
        categories.add(new Category(1,"Điện tử"));
        categories.add(new Category(2,"Thời trang"));
        categories.add(new Category(3, "Sách vở"));
    }
}
