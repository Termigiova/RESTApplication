package com.controllers;


import com.repositories.ProductRepository;
import com.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @RequestMapping(method=RequestMethod.GET, value="/products")
    public Iterable<Product> product() {
        return productRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/products/{id}")
    public Product getMovie(@PathVariable String id) {
        return productRepository.findById(id).get();
    }

    @RequestMapping(method=RequestMethod.POST, value="/products")
    public String save(@RequestBody Product product) {
        productRepository.save(product);

        return product.getId();
    }

    @RequestMapping(method=RequestMethod.GET, value="/products/{id}")
    public Product show(@PathVariable String id) {
        return productRepository.findById(id).get();
    }

    @RequestMapping(method=RequestMethod.PUT, value="/products/{id}")
    public Product update(@PathVariable String id, @RequestBody Product requestedProduct) {
        Product prod = productRepository.findById(id).get();
        prod.assignValuesFrom(requestedProduct);

        productRepository.save(prod);
        return prod;
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/products/{id}")
    public String delete(@PathVariable String id) {
        Product product = productRepository.findById(id).get();
        productRepository.delete(product);

        return "Product deleted";
    }
}