package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderDTO {

    private User user;
    private Product product;
    private LocalDateTime orderDate;
    private int quantity;
    private boolean isSuccesfulySold;

    public ProductOrderDTO(User user, Product product, LocalDateTime orderDate, int quantity, boolean isSuccesfulySold){
        this.user = user;
        this.isSuccesfulySold = isSuccesfulySold;
        this.orderDate = orderDate;
        this.product = product;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isSuccesfulySold() {
        return isSuccesfulySold;
    }
}
