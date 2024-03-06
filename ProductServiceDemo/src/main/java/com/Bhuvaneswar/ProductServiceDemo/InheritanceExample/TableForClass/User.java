package com.Bhuvaneswar.ProductServiceDemo.InheritanceExample.TableForClass;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name="TFC_User")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Username;
    private String Password;
}
