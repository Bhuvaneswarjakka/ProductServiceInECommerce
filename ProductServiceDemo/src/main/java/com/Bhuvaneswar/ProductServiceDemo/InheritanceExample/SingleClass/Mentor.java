package com.Bhuvaneswar.ProductServiceDemo.InheritanceExample.SingleClass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "st_Mentor")
@DiscriminatorValue("2")
public class Mentor extends User
{
    private int noOfSessions;
    private int noOfMentees;
}
