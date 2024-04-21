package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Login;
import com.example.demo.Model.Product;
import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Service.LoginService;
import com.example.demo.Service.ProductService;
import com.example.demo.Service.UserService;

@RestController
@CrossOrigin("http://localhost:3000")
public class Controller {

	@Autowired
	private UserService userservice;
	
	@Autowired
private LoginService loginservice;
	
	@Autowired
	private ProductService prodservice;
	
	
	
	@PostMapping ("api/User")

    public String  livePrice(@RequestBody User userDetails){
        //System.out.println(flowerDetails);

              userservice.saveUser(userDetails);

           return "updatePrice";
    }
	

	@PostMapping ("api/Products")

    public String  saveAllProduct(@RequestBody List< Product> prodDetails) {
        //System.out.println(flowerDetails);

              prodservice.saveProduct(prodDetails);

           return "update all data";
    }
	
	
	@GetMapping ("api/Products")

    public List<Product>  getAllProduct() {
        //System.out.println(flowerDetails);
return   prodservice.getAllData();
    }
	
	@PostMapping("api/login")
	public String user(@RequestBody Login loginDetails ) {
		
         String email=loginDetails.getEmail();
         String password=loginDetails.getPassword();
         System.out.println(email);
         System.out.println(password);
         return loginservice.LoginUser(email, password);
		
	}
	
	@GetMapping("/")
	public List< User >getData() {
		return userservice.getAllData();
		
	}
}
