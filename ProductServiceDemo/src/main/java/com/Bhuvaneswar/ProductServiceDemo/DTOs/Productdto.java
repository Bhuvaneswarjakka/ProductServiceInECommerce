package com.Bhuvaneswar.ProductServiceDemo.DTOs;

import lombok.Data;

@Data
public class Productdto
{
    private Long id;
    private String title;
    private double price;
    private String description;
    private String image;
    private String category;
    private RatingDto rating;
}
