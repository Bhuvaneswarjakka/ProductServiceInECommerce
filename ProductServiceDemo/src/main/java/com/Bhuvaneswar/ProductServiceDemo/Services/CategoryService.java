package com.Bhuvaneswar.ProductServiceDemo.Services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface CategoryService {

    String GetAllCategories();

    String GetProductsInSpecificCategory(@PathVariable("categoryId") Long CategoryId);
}
