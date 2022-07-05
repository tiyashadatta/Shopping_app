package com.example.Product.services;

import com.example.Product.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    Product createProduct(Product product);
    Product updateProduct(int productId, Product product);
    void deleteProduct(int productId);
    Product getProductById(int productId);
    List<Product> getProducts();

}
