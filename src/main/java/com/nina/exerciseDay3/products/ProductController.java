package com.nina.exerciseDay3.products;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

//  private static final int id = 1;
//  private final String name = "Ehe";
//  private final double price = 12345;

  ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }
  @GetMapping
  public String getProduct() {
    return productService.showProduct();
  }
}
