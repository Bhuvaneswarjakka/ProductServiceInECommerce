package com.Bhuvaneswar.ProductServiceDemo.InheritanceExample.MappedSuperClass;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity(name = "Mt_Instructor")

public class Instructor extends User
{
    private boolean isHandsome;
}
