package com.Bhuvaneswar.ProductServiceDemo.controllers;

import com.Bhuvaneswar.ProductServiceDemo.DTOs.GetSingleProductResponseDto;
import com.Bhuvaneswar.ProductServiceDemo.DTOs.Productdto;
import com.Bhuvaneswar.ProductServiceDemo.Repositories.ProductRepository;
import com.Bhuvaneswar.ProductServiceDemo.Services.ProductService;
import com.Bhuvaneswar.ProductServiceDemo.models.Category;
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
    private ProductRepository productRepository;
    public ProductController(ProductService productService, ProductRepository productRepository)
    {
        this.productRepository=productRepository;
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

        Product newProduct=new Product();
        newProduct.setTitle(product.getTitle());
        newProduct.setPrice(product.getPrice());
        newProduct.setDescription(product.getDescription());
        newProduct.setImageUrl(product.getImage());
        newProduct = productRepository.save(newProduct);

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
