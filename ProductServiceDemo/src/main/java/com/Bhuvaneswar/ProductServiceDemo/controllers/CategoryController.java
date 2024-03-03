package com.Bhuvaneswar.ProductServiceDemo.controllers;

import com.Bhuvaneswar.ProductServiceDemo.Services.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController
{
    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService)
    {
        this.categoryService=categoryService;
    }
    @GetMapping("/categories")
    public String GetAllCategories()
    {
        return "Getting all Categories";
    }

    @GetMapping("/categories/{categoryId}")
    public String GetProductsInSpecificCategory(@PathVariable("categoryId") Long CategoryId)
    {
        return "Getting Products in specific category " + CategoryId;
    }
}
