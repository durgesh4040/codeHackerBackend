package com.example.demo.Model;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
public class Login {
	   
	   
	    
	    private String   email;
	    private String password;
	
	  
}
