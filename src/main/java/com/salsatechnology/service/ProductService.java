package com.salsatechnology.service;

import com.salsatechnology.model.Product;
import com.salsatechnology.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ProductService {

	private final ProductRepository productRepository;

	public ResponseEntity<Object> findProductByProductType(String productType) {
		return new ResponseEntity<>(productRepository.findProductByType(productType),HttpStatus.OK);
	}

	public ResponseEntity<Object> findProducts(Pageable pageable) {
		Page<Product> list = productRepository.findProducts(pageable);
		return new ResponseEntity<>(new PageImpl<Product>(list.toList(), pageable, list.getTotalElements()),
				HttpStatus.OK);
	}

}
