package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderRequest {

    private User user;
    private Product product;
    private int quantity;
    private LocalDateTime orderDate;

    ProductOrderRequest(User user,Product product, int quantity,LocalDateTime orderDate){
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }
}
