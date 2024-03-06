package com.Bhuvaneswar.ProductServiceDemo.InheritanceExample.TableForClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Data
@Entity(name = "TFC_TA")

public class TA extends User
{
    private double AverageRating;
}
