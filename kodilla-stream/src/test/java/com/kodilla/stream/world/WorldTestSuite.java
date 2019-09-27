package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        Continent asia = new Continent();
        Continent europe = new Continent();


        Country greece = new Country(new BigDecimal("22114224"));
        europe.addCountry(greece);
        Country poland  = new Country(new BigDecimal("35181585"));
        europe.addCountry(poland);
        Country austria = new Country(new BigDecimal("1979548"));
        europe.addCountry(austria);
        Country norway = new Country(new BigDecimal("15359900"));
        europe.addCountry(norway);
        Country sweden = new Country(new BigDecimal("22354321"));
        europe.addCountry(sweden);

        Country china = new Country(new BigDecimal("60230042030"));
        asia.addCountry(china);


        //When
        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("63004253245");
        Assert.assertEquals(expectedPeopleQuantity, world.getPeopleQuantity());
    }
}
