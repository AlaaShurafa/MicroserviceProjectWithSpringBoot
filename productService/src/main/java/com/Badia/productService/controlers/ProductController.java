package com.Badia.productService.controlers;

import com.Badia.productService.models.Product;
import com.Badia.productService.services.ProductService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@Slf4j
@RequestMapping("/Products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/")
    public Product saveProduct(@RequestBody Product product){
//        return 'test';
        return productService.saveProduct(product);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Integer productId){
        log.info("Inside findProductById in Product Controller");
        return productService.getProductId(productId);
    }
    @GetMapping("/")
    public List<Product>  getProducts() {
        return (List<Product>) productService.getProducts();
    }
}