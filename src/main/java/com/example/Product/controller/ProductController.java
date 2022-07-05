package com.example.Product.controller;

import com.example.Product.entities.Product;
import com.example.Product.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/create-product", method = RequestMethod.POST)
    public Product createproduct(@RequestBody Product product){
        Product createdProduct = productService.createproduct(product);
        System.out.println("Product created");
        return createdProduct;
    }

    @RequestMapping(value = "/update-product/{productId}", method = RequestMethod.PUT)
    public Product updateproduct(@PathVariable int productId, @RequestBody Product product){
        Product updatedProduct = productService.updateproduct(productId, product);
        return updatedProduct;
    }

    @RequestMapping(value = "/get-productbyID/{productId}", method = RequestMethod.GET)
    public Product getproduct(int productId){
        Product fetchedProduct = productService.getproductbyId(productId);
        return fetchedProduct;
    }

    @RequestMapping(value = "/get-products", method = RequestMethod.GET)
    public List<Product> getproducts(){
        List<Product> allProducts = productService.getproducts();
        return allProducts;
    }

    @RequestMapping(value = "/delete-product/{productId}", method = RequestMethod.DELETE)
    public void deleteproduct(int productId){
        productService.deleteproduct(productId);
    }
}
