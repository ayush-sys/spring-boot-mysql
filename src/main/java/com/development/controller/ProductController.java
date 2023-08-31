package com.development.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

	@GetMapping("/product-by-id/{id}")
	public String getProductById(@PathVariable long id) {
		return "Failed to get product with id " + id;
	}
	
	@GetMapping("/all-products")
	public String getAllProducts() {
		return "Failed to get any product";
	}
	
	@PostMapping("/add-product")
	public String addProduct(@RequestBody String name, String maker, Double price) {
		return "Product added succesfully to DB";
	}
	
	@DeleteMapping("/delete-product-by-id/{id}")
	public String deleteProductById(@PathVariable long id) {
		return "Product deleted from DB";
	}
	
	@PutMapping("/update-product-by-id")
	public String updateProductById(@RequestBody String name, String maker, Double price) {
		return "Product details updated in DB";
	}
}
