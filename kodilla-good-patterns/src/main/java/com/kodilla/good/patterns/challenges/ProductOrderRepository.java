package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface ProductOrderRepository {

    boolean createProductOrder(User user, LocalDateTime orderDate, int quantity, Product product);
}
