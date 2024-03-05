package com.Bhuvaneswar.ProductServiceDemo.Services;

import com.Bhuvaneswar.ProductServiceDemo.DTOs.FakeStoreProductdto;
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

    private Product ConvertFakeStoreProductDtoToProduct(FakeStoreProductdto productdto)
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
        return product;
    }
    @Override
    public List<Product> GetAllProducts()
    {
        RestTemplate restTemplate=restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductdto[]> response=restTemplate.getForEntity(
                "https://fakestoreapi.com/products",
                FakeStoreProductdto[].class
        );

        List<Product> ans=new ArrayList<>();

        for(FakeStoreProductdto productdto : response.getBody())
        {
            ans.add(ConvertFakeStoreProductDtoToProduct(productdto));
        }

        return ans;
    }

    @Override
    public Product GetSingleProduct(Long productId)
    {
        RestTemplate restTemplate=restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductdto> response= restTemplate.getForEntity("https://fakestoreapi.com/products/{id}",
                FakeStoreProductdto.class, productId);

        FakeStoreProductdto productdto=response.getBody();
        return ConvertFakeStoreProductDtoToProduct(productdto);
    }

    @Override
    public Product AddProduct(Productdto product)
    {
        RestTemplate restTemplate=restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductdto> response = restTemplate.postForEntity("https://fakestoreapi.com/products",
                product,FakeStoreProductdto.class);

        FakeStoreProductdto productdto=response.getBody();

        return ConvertFakeStoreProductDtoToProduct(productdto);
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
