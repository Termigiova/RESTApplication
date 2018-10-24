package com.repositories;


import com.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends MongoRepository<Product, String> {

    @Override
    public Optional<Product> findById(String id);
    @Override
    void delete(Product deleted);
}
