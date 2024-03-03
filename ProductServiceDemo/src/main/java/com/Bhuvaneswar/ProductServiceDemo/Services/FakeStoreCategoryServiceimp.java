package com.Bhuvaneswar.ProductServiceDemo.Services;

import org.springframework.stereotype.Service;

@Service
public class FakeStoreCategoryServiceimp implements CategoryService
{

    @Override
    public String GetAllCategories() {
        return null;
    }

    @Override
    public String GetProductsInSpecificCategory(Long CategoryId) {
        return null;
    }
}
