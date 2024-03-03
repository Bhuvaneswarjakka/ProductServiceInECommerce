package com.Bhuvaneswar.ProductServiceDemo.Services;

import com.Bhuvaneswar.ProductServiceDemo.DTOs.productdto;
import org.springframework.stereotype.Service;

@Service
public class FakeStoreproductserviceimp implements ProductService
{

    @Override
    public String GetAllProducts() {
        return null;
    }

    @Override
    public String GetSingleProduct(Long productId) {
        return null;
    }

    @Override
    public String AddProduct(productdto productdto) {
        return null;
    }

    @Override
    public String UpdateProduct(Long productId) {
        return null;
    }

    @Override
    public String DeleteProduct(Long productId) {
        return null;
    }
}
