package com.kodilla.good.patterns.challenges;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ProductOrderRequestRetriever {

    public ProductOrderRequest retrieve() {

        User user = new User("Daniel", "Dan", "Kowalski");
        LocalDateTime orderDate = LocalDateTime.of(2019, 12, 22, 14, 33);
        Product product = new Keyboard("Aurora", "K-3", new BigDecimal((200)));
        int quantity = 1;

        System.out.println("Retrieve product request: ");
        System.out.println("User: "+ user.getUserName()+ " Date: "+orderDate+ " \n"+ product+ ", quantity:"+quantity);

        return new ProductOrderRequest(user, product, quantity, orderDate);


    }
}

