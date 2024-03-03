package com.Bhuvaneswar.ProductServiceDemo.controllers;

import com.Bhuvaneswar.ProductServiceDemo.DTOs.productdto;
import com.Bhuvaneswar.ProductServiceDemo.Services.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController
{
    private ProductService productService;
    public ProductController(ProductService productService)
    {
        this.productService=productService;
    }
    @GetMapping("/products")
    public String GetAllProducts()
    {
        return "Getting all products";
    }

    @GetMapping("/products/{productId}")
    public String GetSingleProduct(@PathVariable("productId") Long productId)
    {
        return "Getting the single product with id "+productId;
    }

    @PostMapping("/products")
    public String AddProduct(@RequestBody productdto productdto)
    {
        return "Adding new product"+productdto;
    }

    @PutMapping("/products/{productId}")
    public String UpdateProduct(@PathVariable("productId") Long productId)
    {
        return "Updating Product";
    }


    @DeleteMapping("/products/{productId}")
    public String DeleteProduct(@PathVariable("productId") Long productId)
    {
        return "Deleting product";
    }






}
