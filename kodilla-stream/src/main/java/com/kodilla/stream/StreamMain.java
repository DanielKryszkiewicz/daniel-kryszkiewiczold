package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;

public class StreamMain implements PoemDecorator {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Daniel", String::toUpperCase);
        poemBeautifier.beautify("DANIEL", String::toLowerCase);
        poemBeautifier.beautify("daniel", text->text+"abc");
        poemBeautifier.beautify("DANIEL", text->text.substring(1,3));
        poemBeautifier.beautify("DANIEL",text->text.concat("KONG"));
    }

    @Override
    public String decorate(String text) {
        return null;
    }
}