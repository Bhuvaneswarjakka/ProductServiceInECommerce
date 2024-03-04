package com.Bhuvaneswar.ProductServiceDemo.DTOs;

import com.Bhuvaneswar.ProductServiceDemo.models.Product;
import lombok.Data;

@Data
public class GetSingleProductResponseDto
{
    private Product product;
}
