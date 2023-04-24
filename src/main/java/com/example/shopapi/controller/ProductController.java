package com.example.shopapi.controller;

import com.example.shopapi.entity.ProductsEntity;
import com.example.shopapi.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService=productService;
    }
    @GetMapping
    public List<ProductsEntity> findAllUsers(){
        return productService.findAllProducts();
    }
    @GetMapping("/{id}")
    public Optional<ProductsEntity> findById(@PathVariable("id")Long product_id){
        return productService.findById(product_id);
    }
    @PostMapping
    public ProductsEntity saveProduct(@RequestBody ProductsEntity productsEntity){
        return productService.saveProduct(productsEntity);
    }
    @PutMapping
    public ProductsEntity updateProduct(@RequestBody ProductsEntity productsEntity){
        return productService.updateProduct(productsEntity);
    }
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id")Long product_id){
        productService.deleteProduct(product_id);
    }
}
