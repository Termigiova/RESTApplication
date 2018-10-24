package com.repositories;


import com.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface ProductRepository extends MongoRepository<Product, String> {

    @Override
    Optional<Product> findById(String id);
    @Override
    void delete(Product deleted);
}
