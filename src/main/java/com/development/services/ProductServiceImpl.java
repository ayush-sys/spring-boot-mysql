package com.development.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.development.entity.ProductEntity;
import com.development.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepo;

	@Override
	public ProductEntity saveProduct(ProductEntity product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductEntity> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductEntity getProductById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductEntity updateProducts(ProductEntity product, Long productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDepartmentById(Long productId) {
		// TODO Auto-generated method stub
		
	}
}
