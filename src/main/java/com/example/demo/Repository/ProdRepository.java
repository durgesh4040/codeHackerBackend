package com.example.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.Model.Product;
import com.example.demo.Model.User;

public interface ProdRepository extends MongoRepository<Product,String>{

}
