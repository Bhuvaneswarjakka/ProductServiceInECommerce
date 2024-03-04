package com.Bhuvaneswar.ProductServiceDemo.controllers;

import com.Bhuvaneswar.ProductServiceDemo.DTOs.GetSingleProductResponseDto;
import com.Bhuvaneswar.ProductServiceDemo.DTOs.Productdto;
import com.Bhuvaneswar.ProductServiceDemo.Services.ProductService;
import com.Bhuvaneswar.ProductServiceDemo.models.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ProductController
{
    private ProductService productService;
    public ProductController(ProductService productService)
    {
        this.productService=productService;
    }
    @GetMapping("/products")
    public List<Product> GetAllProducts()
    {
        return productService.GetAllProducts();
    }

    @GetMapping("/products/{productId}")
    public ResponseEntity<Product> GetSingleProduct(@PathVariable("productId") Long productId)
    {
        ResponseEntity<Product> response=new ResponseEntity<>(
                productService.GetSingleProduct(productId), HttpStatus.BAD_REQUEST
        );
//        GetSingleProductResponseDto getSingleProductResponseDto=new GetSingleProductResponseDto();
//        getSingleProductResponseDto.setProduct(
//                productService.GetSingleProduct(productId)
//        );
        return response;
    }

    @PostMapping("/products")
    public ResponseEntity<Product> AddProduct(@RequestBody Productdto product)
    {
        ResponseEntity<Product> response=new ResponseEntity<>(
                productService.AddProduct(product),HttpStatus.OK
        );
        return response;
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
