package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class KeyboardOrderService implements ProductOrderService {

    @Override
    public boolean sold(User user, LocalDateTime orderDate, Product product, int quantity) {
        return false;
    }
}
