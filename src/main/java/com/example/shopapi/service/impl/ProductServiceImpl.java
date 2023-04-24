package com.example.shopapi.service.impl;

import com.example.shopapi.entity.ProductsEntity;
import com.example.shopapi.repository.ProductRepository;
import com.example.shopapi.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository=productRepository;
    }

    @Override
    public List<ProductsEntity> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<ProductsEntity> findById(Long product_id) {
        return productRepository.findById(product_id);
    }

    @Override
    public ProductsEntity saveProduct(ProductsEntity productsEntity) {
        return productRepository.save(productsEntity);
    }

    @Override
    public ProductsEntity updateProduct(ProductsEntity productsEntity) {
        return productRepository.save(productsEntity);
    }

    @Override
    public void deleteProduct(Long product_id) {
        productRepository.deleteById(product_id);
    }
}
