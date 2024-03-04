package com.Bhuvaneswar.ProductServiceDemo.Services;

import com.Bhuvaneswar.ProductServiceDemo.DTOs.Productdto;
import com.Bhuvaneswar.ProductServiceDemo.models.Product;

import java.util.List;

public interface ProductService {

    List<Product> GetAllProducts();

    Product GetSingleProduct(Long productId);

    Product AddProduct(Productdto product);

    Product UpdateProduct(Long productId, Product product);

    String DeleteProduct(Long productId);
}
