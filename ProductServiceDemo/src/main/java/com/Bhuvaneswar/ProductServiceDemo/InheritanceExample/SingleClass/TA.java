package com.Bhuvaneswar.ProductServiceDemo.InheritanceExample.SingleClass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "st_TA")
@DiscriminatorValue("3")
public class TA extends User
{
    private double AverageRating;
}
