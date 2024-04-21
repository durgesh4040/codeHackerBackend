package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
    private  UserRepository userRepo;
	 public String saveUser(User userDetails){

	      
	        userRepo.save(userDetails);
	        return "Live Price is save";
	    }
	 
	 public User getUser(String email) {
		 return  userRepo.findByEmail(email);
	 }
	 
	 public  List<User> getAllData(){
		return userRepo.findAll();
	 }
}
