package com.kodilla.good.patterns.challenges.foodshop;

import java.util.Objects;

public class GlutenFreeProduct {

    String productName;
    String productDescription;

    public GlutenFreeProduct(String productName, String productDescription){
        this.productDescription = productDescription;
        this.productName = productName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GlutenFreeProduct that = (GlutenFreeProduct) o;
        return Objects.equals(productName, that.productName) &&
                Objects.equals(productDescription, that.productDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productDescription);
    }
}
