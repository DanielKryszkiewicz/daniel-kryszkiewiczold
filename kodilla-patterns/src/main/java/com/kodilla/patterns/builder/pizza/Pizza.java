package com.kodilla.patterns.builder.pizza;

import java.util.List;

public final class Pizza {
    private final String bottom;
    private final String sauce;
    private final List<String> ingredients;

    public Pizza(final String bottom, final String sauce,final String... ingredients){
        this.bottom = bottom;
        this.sauce = sauce;

    }

}
