package com.example.demo.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection="Product")
@Data
public class Product {
	
private String name;
private String price;
private String description;
private String prodimage;
}
