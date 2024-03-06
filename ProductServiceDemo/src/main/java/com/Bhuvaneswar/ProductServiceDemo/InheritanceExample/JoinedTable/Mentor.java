package com.Bhuvaneswar.ProductServiceDemo.InheritanceExample.JoinedTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity(name = "jt_Mentor")
@PrimaryKeyJoinColumn(name = "user_id")
public class Mentor extends User
{
    private int noOfSessions;
    private int noOfMentees;
}
