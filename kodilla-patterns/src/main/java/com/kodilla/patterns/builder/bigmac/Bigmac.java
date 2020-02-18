package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String bun;
    private final String burger;
    private final List<String> sauces;
    private final List<String> ingredients;

    public static class BigMacBuilder {
        private String bun;
        private String burger;
        private List<String> sauces = new ArrayList<>();
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigMacBuilder burger(String burger) {
            this.burger = burger;
            return this;
        }

        public BigMacBuilder sauces(String sauce) {
            sauces.add(sauce);
            return this;
        }

        public BigMacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, sauces, burger, ingredients);
        }
    }

        private Bigmac(final String bun, List<String> sauces, final String burger, List<String> ingredients){
            this.bun = bun;
            this.burger = burger;
            this.sauces = new ArrayList<>(sauces);
            this.ingredients = new ArrayList<>(ingredients);
        }


    public String getBun() {
        return bun;
    }

    public String getBurger() {
        return burger;
    }

    public List<String> getSauces() {
        return sauces;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}















