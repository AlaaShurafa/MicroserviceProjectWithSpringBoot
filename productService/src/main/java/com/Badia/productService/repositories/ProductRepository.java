package com.Badia.productService.repositories;


import com.Badia.productService.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer>{

    public Product getProductById(Integer productId);
}