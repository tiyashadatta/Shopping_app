package com.example.Product.services;

import com.example.Product.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    public Product createproduct(Product product);
    public Product updateproduct(int productId,Product product);
    public void deleteproduct(int productId);
    public Product getproductbyId(int productId);
    public List<Product> getproducts();

}
