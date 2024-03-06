package com.Bhuvaneswar.ProductServiceDemo.InheritanceExample.SingleClass;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name="st_User")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name = "ST_User",
        discriminatorType = DiscriminatorType.INTEGER
)
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Username;
    private String Password;
}
