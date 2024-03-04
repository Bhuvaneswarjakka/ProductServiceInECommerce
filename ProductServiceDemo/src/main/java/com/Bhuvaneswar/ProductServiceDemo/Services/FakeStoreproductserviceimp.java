package com.Bhuvaneswar.ProductServiceDemo.Services;

import com.Bhuvaneswar.ProductServiceDemo.DTOs.Productdto;
import com.Bhuvaneswar.ProductServiceDemo.models.Category;
import com.Bhuvaneswar.ProductServiceDemo.models.Product;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class FakeStoreproductserviceimp implements ProductService
{
    RestTemplateBuilder restTemplateBuilder=new RestTemplateBuilder();

    public FakeStoreproductserviceimp(RestTemplateBuilder restTemplateBuilder)
    {
        this.restTemplateBuilder=restTemplateBuilder;
    }
    @Override
    public List<Product> GetAllProducts()
    {
        RestTemplate restTemplate=restTemplateBuilder.build();
        ResponseEntity<Productdto[]> response=restTemplate.getForEntity(
                "https://fakestoreapi.com/products",
                Productdto[].class
        );

        List<Product> ans=new ArrayList<>();

        for(Productdto productdto : response.getBody())
        {
            Product product=new Product();
            product.setId(productdto.getId());
            Category category=new Category();
            category.setName(productdto.getCategory());
            product.setCategory(category);
            product.setTitle(productdto.getTitle());
            product.setPrice(productdto.getPrice());
            product.setDescription(productdto.getDescription());
            product.setImageUrl(productdto.getImage());
            ans.add(product);
        }

        return ans;
    }

    @Override
    public Product GetSingleProduct(Long productId)
    {
        RestTemplate restTemplate=restTemplateBuilder.build();
        ResponseEntity<Productdto> response= restTemplate.getForEntity("https://fakestoreapi.com/products/{id}",
                Productdto.class, productId);
        Productdto productdto=response.getBody();
        Product product=new Product();
        product.setId(productdto.getId());
        Category category=new Category();
        category.setName(productdto.getCategory());
        product.setCategory(category);
        product.setTitle(productdto.getTitle());
        product.setPrice(productdto.getPrice());
        product.setDescription(productdto.getDescription());
        product.setImageUrl(productdto.getImage());
        return product;
    }

    @Override
    public Product AddProduct(Productdto product)
    {
        RestTemplate restTemplate=restTemplateBuilder.build();
        ResponseEntity<Productdto> response = restTemplate.postForEntity("https://fakestoreapi.com/products",
                product,Productdto.class);

        Productdto productdto=response.getBody();
        Product product1=new Product();
        product1.setId(productdto.getId());
        Category category=new Category();
        category.setName(productdto.getCategory());
        product1.setCategory(category);
        product1.setTitle(productdto.getTitle());
        product1.setPrice(productdto.getPrice());
        product1.setDescription(productdto.getDescription());
        product1.setImageUrl(productdto.getImage());

        return product1;
    }

    @Override
    public Product UpdateProduct(Long productId, Product product) {
        return null;
    }

    @Override
    public String DeleteProduct(Long productId) {
        return null;
    }
}
