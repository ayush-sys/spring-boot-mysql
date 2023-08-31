package com.development.services;

import java.util.List;

import com.development.entity.ProductEntity;

public interface ProductService {
	
	//add-product
	ProductEntity saveProduct(ProductEntity product);

	//return-all-products
	List<ProductEntity> getProducts();

	//return-product-by-id
	ProductEntity getProductById();
	
	//update-product
	ProductEntity updateProducts(ProductEntity product, Long productId);

	//delete-product
	void deleteDepartmentById(Long productId);
}