package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class KeyboardOrderRepository implements ProductOrderRepository {

    @Override
    public boolean createProductOrder(User user, LocalDateTime orderDate, int quantity, Product product) {
        return false;
    }
}
