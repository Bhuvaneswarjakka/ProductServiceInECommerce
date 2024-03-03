package com.Bhuvaneswar.ProductServiceDemo.models;

import lombok.Data;

import java.util.Date;

@Data
public class BaseModel
{
    private Long id;
    private Date createdAt;
    private Date lastUpdatedAt;
    private boolean isDeleted;

}
