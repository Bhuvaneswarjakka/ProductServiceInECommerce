package com.Bhuvaneswar.ProductServiceDemo.Services;

import com.Bhuvaneswar.ProductServiceDemo.DTOs.productdto;

public interface ProductService {

    String GetAllProducts();

    String GetSingleProduct(Long productId);

    String AddProduct(productdto productdto);

    String UpdateProduct(Long productId);

    String DeleteProduct(Long productId);
}
