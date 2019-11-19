package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.social.*;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User daniel = new Millenials("Daniel");
        User janek = new YGeneration("Janek");
        User andrzej = new ZGeneration("Andrzej");
        //When
        String danielShouldUse = daniel.sharePost();
        System.out.println("Daniel should use: "+danielShouldUse);
        String janekShouldUse = janek.sharePost();
        System.out.println("Janek should use: "+janekShouldUse);
        String andrzejShouldUse = andrzej.sharePost();
        System.out.println("Andrzej should use: "+andrzejShouldUse);
        //Then
        Assert.assertEquals("[Snapchat Publisher] using Snapchat", danielShouldUse);
        Assert.assertEquals("[Twitter Publisher] using Twitter", janekShouldUse);
        Assert.assertEquals("[Facebook Publisher] using Facebook", andrzejShouldUse);
    }
    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User daniel = new Millenials("Daniel");

        //When
        String danielShoulUse = daniel.sharePost();
        System.out.println("Daniel should use: "+danielShoulUse);
        daniel.setSocialPublisher(new TwitterPublisher());
        danielShoulUse = daniel.sharePost();
        System.out.println("Daniel should now use: "+danielShoulUse);

        //Then
        Assert.assertEquals("[Twitter Publisher] using Twitter", danielShoulUse);
    }
}
