package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.User;

import com.example.demo.Repository.UserRepository;

@Service
public class LoginService {
	
  
	
	@Autowired
	private UserService userservice;
	
	@Autowired
	private UserRepository userRepository;
	 public String LoginUser(String email,String password){
              
		 
	     User user = userservice.getUser(email);
	     System.out.println(user);
	        
	        if (user != null && user.getPassword().equals(password)) {
	         
	            return user.getName();
	        } else {
	        
	            return null;
	        }
	      
	        
	    }
}
