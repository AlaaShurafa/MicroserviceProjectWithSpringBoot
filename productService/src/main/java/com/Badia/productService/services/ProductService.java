package com.Badia.productService.services;

import com.Badia.productService.models.Product;
import com.Badia.productService.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//import org.springframework.web.client.RestTemplate;


@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

//    @Autowired
//    private RestTemplate restTemplate;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product getProductId(Integer productId) {
        return productRepository.getProductById(productId);
    }

}