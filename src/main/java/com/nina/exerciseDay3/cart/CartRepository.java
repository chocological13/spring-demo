package com.nina.exerciseDay3.cart;

import org.springframework.stereotype.Repository;

@Repository
public class CartRepository {

  Cart cart;

  public CartRepository() {
    this.cart = new Cart(0, 1);
  }

  public Cart getCart() {
    return this.cart;
  }
}
