package com.development.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.development.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long>{

}
