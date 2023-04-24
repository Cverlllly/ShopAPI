package com.example.shopapi.service;

import com.example.shopapi.entity.ProductsEntity;
import com.example.shopapi.entity.UsersEntity;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<ProductsEntity> findAllProducts();
    Optional<ProductsEntity> findById(Long product_id);
    ProductsEntity saveProduct(ProductsEntity productsEntity);
    ProductsEntity updateProduct(ProductsEntity productsEntity);
    void deleteProduct(Long product_id);
}
