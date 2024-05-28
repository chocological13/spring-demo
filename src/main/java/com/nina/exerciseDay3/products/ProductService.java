package com.nina.exerciseDay3.products;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

  private ProductRepository productRepository;

  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public String showProduct() {
   return productRepository.getProduct().getName();
  }

}
