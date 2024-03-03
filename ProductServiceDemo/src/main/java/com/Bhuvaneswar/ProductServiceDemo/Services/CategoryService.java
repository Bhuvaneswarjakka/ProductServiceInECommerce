package com.Bhuvaneswar.ProductServiceDemo.Services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface CategoryService {
    @GetMapping("/categories")
    String GetAllCategories();

    @GetMapping("/categories/{categoryId}")
    String GetProductsInSpecificCategory(@PathVariable("categoryId") Long CategoryId);
}
