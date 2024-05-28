package com.nina.exerciseDay3.cart;

import org.springframework.stereotype.Service;

@Service
public class CartService {

  private CartRepository cartRepository;

public CartService(CartRepository cartRepository) {
  this.cartRepository = cartRepository;
}

public String showCart() {
  int id = cartRepository.getCart().getId();
  int quantity = cartRepository.getCart().getQuantity();
  String message = "You have item " + id + " with the amount of " + quantity;

  return message;
}
}
