package com.nina.exerciseDay3.products;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
  Product product;

public ProductRepository() {
  this.product = new Product(0, "AAAAA", 5.0);
}

public Product getProduct() {
  return this.product;
}
}