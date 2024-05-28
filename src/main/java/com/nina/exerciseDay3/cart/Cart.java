package com.nina.exerciseDay3.cart;

public class Cart {

  private int id;
  private int quantity;

  public Cart(int id, int quantity) {
    this.id = id;
    this.quantity = quantity;
  }

  public int getId() {
    return id;
  }

  public int getQuantity() {
    return quantity;
  }
}
