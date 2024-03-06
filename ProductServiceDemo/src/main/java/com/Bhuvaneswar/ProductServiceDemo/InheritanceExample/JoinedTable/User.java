package com.Bhuvaneswar.ProductServiceDemo.InheritanceExample.JoinedTable;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name="jt_User")
@Inheritance(strategy = InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name = "user_id")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Username;
    private String Password;
}
