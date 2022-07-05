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

    public Product updateproduct(int productId, Product newProduct) {
        List<Product> updatedList = list.stream().map(p -> {
            if (p.getProductId() == productId) {
                //updated product
                p.setProductName(newProduct.getProductName());
                p.setProductDesc(newProduct.getProductDesc());
                p.setProductPrice(newProduct.getProductPrice());
                p.setAvailable(newProduct.isAvailable());

                return p;
            } else {
                return p;
            }
        }).collect(Collectors.toList());

        list = updatedList;
        newProduct.setProductId(productId);
        return newProduct;

    }

    public void deleteproduct(int productId) {
        List<Product> newList = list.
                stream().
                filter(p -> p.getProductId() != productId).
                collect(Collectors.toList());
        list = newList;
    }

    public Product getproductbyId(int productId) {
        Product product = list.
                stream().
                filter(p -> p.getProductId() == productId).
                findFirst().
                get();
        System.out.println(product.getProductName());
        return product;
    }

    public List<Product> getproducts() {
        return list;
    }
}
