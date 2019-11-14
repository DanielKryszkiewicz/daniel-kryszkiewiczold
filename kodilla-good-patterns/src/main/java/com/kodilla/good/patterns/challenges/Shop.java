package com.kodilla.good.patterns.challenges;

public class Shop {
    public static void main(String[] args) {

        ProductOrderRequestRetriever productOrderRequestRetriever = new ProductOrderRequestRetriever();
        ProductOrderRequest productOrderRequest = new ProductOrderRequestRetriever().retrieve();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new MailService(), new KeyboardOrderService(), new KeyboardOrderRepository());
        productOrderProcessor.process(productOrderRequest);
    }
}
