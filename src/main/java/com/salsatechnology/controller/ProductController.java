package com.salsatechnology.controller;

import com.salsatechnology.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@GetMapping("/{productType}")
	public ResponseEntity<Object> getProductsByProductType(@PathVariable String productType) {
		return productService.findProductByProductType(productType);
	}

	@GetMapping
	public ResponseEntity<Object> getProducts(Pageable pageable) {
		return productService.findProducts(pageable);
	}
}
