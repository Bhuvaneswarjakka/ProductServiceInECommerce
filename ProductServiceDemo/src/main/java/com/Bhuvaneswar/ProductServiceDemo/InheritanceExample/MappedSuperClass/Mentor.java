package com.Bhuvaneswar.ProductServiceDemo.InheritanceExample.MappedSuperClass;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity(name = "Mt_Mentor")

public class Mentor extends User
{
    private int noOfSessions;
    private int noOfMentees;
}
