package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Product;
import com.example.demo.Model.User;
import com.example.demo.Repository.ProdRepository;
import com.example.demo.Repository.UserRepository;

@Service
public class ProductService {

	
	@Autowired
    private  ProdRepository prodRepo;
	 public String saveProduct(List<Product> productDetails){

	      
	        prodRepo.saveAll(productDetails);
	        return "Live Price is save";
	    }
	 
	

	public List<Product> getAllData() {
		// TODO Auto-generated method stub
		return prodRepo.findAll();
	}
}
