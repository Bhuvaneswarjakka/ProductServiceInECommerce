package com.Bhuvaneswar.ProductServiceDemo.InheritanceExample.SingleClass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "St_Instructor")
@DiscriminatorValue("1")
public class Instructor extends User
{
    private boolean isHandsome;
}
