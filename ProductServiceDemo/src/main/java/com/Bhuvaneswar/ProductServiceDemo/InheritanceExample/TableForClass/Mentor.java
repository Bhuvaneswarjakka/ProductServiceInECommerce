package com.Bhuvaneswar.ProductServiceDemo.InheritanceExample.TableForClass;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "TFC_Mentor")
public class Mentor extends User
{
    private int noOfSessions;
    private int noOfMentees;
}
