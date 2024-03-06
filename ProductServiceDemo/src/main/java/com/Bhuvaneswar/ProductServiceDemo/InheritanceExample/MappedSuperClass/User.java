package com.Bhuvaneswar.ProductServiceDemo.InheritanceExample.MappedSuperClass;

import jakarta.persistence.*;
import lombok.Data;

@Data
@MappedSuperclass
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Username;
    private String Password;
}
