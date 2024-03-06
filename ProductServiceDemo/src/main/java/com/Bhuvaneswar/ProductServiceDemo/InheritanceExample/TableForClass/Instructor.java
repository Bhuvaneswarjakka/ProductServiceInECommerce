package com.Bhuvaneswar.ProductServiceDemo.InheritanceExample.TableForClass;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "TFC_Instructor")
public class Instructor extends User
{
    private boolean isHandsome;
}
