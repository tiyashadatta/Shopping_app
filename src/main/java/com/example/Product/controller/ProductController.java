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
    public Product createProduct(@RequestBody Product product){
        Product createdProduct = productService.createProduct(product);
        System.out.println("Product created");
        return createdProduct;
    }

    @RequestMapping(value = "/update-product/{productId}", method = RequestMethod.PUT)
    public Product updateProduct(@PathVariable int productId, @RequestBody Product product){
        Product updatedProduct = productService.updateProduct(productId, product);
        return updatedProduct;
    }

    @RequestMapping(value = "/get-productbyID/{productId}", method = RequestMethod.GET)
    public Product getProduct(@PathVariable int productId){
        Product fetchedProduct = productService.getProductById(productId);
        return fetchedProduct;
    }

    @RequestMapping(value = "/get-products", method = RequestMethod.GET)
    public List<Product> getProducts(){
        List<Product> allProducts = productService.getProducts();
        return allProducts;
    }

    @RequestMapping(value = "/delete-product/{productId}", method = RequestMethod.DELETE)
    public String deleteProduct(@PathVariable int productId){
        productService.deleteProduct(productId);
        return "Product deleted successfully";
    }
}
