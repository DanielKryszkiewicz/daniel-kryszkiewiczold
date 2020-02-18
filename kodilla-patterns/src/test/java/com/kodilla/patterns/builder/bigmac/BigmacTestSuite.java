package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigMacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigMacBuilder()
                .ingredient("Salad")
                .bun("gluten free")
                .sauces("standard")
                .sauces("bbq")
                .burger("vegan")
                .build();
        System.out.println(bigmac);
        //When
        int howManySauces = bigmac.getSauces().size();
        //Then
        Assert.assertEquals(2,howManySauces);

    }
}
