package com.example.shopapi.repository;

import com.example.shopapi.entity.ProductsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository <ProductsEntity, Long>{

}
