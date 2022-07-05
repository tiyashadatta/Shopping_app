package com.example.Product.services;

import com.example.Product.entities.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService{

    List<Product> list = new ArrayList<>();

    public Product createproduct(Product product) {
        list.add(product);
        return product;
    }

    public Product updateproduct(int productId, Product product) {
        List<Product> updatedProduct = list.stream().map((p) -> {
            if (p.getProductId() == productId) {
                p.setProductName(product.getProductName());
                return p;
            }else{
                return p;
            }
        }).collect(Collectors.toList());
        list= updatedProduct;
        return product;
    }

    public void deleteproduct(int productId) {

    }

    public Product getproductbyId(int productId) {
        return null;
    }

    public List<Product> getproducts() {
        return list;
    }
}
