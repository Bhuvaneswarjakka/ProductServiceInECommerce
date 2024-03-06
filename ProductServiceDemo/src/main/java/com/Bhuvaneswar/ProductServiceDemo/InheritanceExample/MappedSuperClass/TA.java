package com.Bhuvaneswar.ProductServiceDemo.InheritanceExample.MappedSuperClass;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity(name = "Mt_TA")

public class TA extends User
{
    private double AverageRating;
}
