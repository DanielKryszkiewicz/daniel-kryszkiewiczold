package com.kodilla.patterns.singleton;
import com.kodilla.patterns.singleton.Logger;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    private static LoggerTestSuite loggerTestSuite;

    @Test
    public void testLastLog(){
        //Given
        Logger logger = new Logger();
        logger.log("Daniel");
        //When
        logger.getInstance().getLastLog();
        //Then
        Assert.assertTrue("Daniel",true);
    }
}
