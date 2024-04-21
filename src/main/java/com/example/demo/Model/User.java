package com.example.demo.Model;


import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="userData")
@Data
public class User {
	   
	     private String id;
	     private String name;
	    @Indexed(unique = true)
	    private String   email;
	    private String address;
	    private String password;
	  
}
