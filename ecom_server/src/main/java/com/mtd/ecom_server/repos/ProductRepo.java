package com.mtd.ecom_server.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mtd.ecom_server.models.Product;

public interface ProductRepo extends MongoRepository<Product, String> {

}
