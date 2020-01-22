package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDriving(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.taskExecutor(TaskFactory.DRIVINGTASK);
        boolean beforeExecution = driving.isTaskExecuted();
        driving.executeTask();
        //Then
        Assert.assertEquals("Trip1", driving.getTaskName());
        Assert.assertFalse(beforeExecution);
        Assert.assertTrue(driving.isTaskExecuted());
    }
    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.taskExecutor(TaskFactory.SHOPPINGTASK);
        boolean beforeExecution = driving.isTaskExecuted();
        driving.executeTask();
        //Then
        Assert.assertEquals("Food", driving.getTaskName());
        Assert.assertFalse(beforeExecution);
        Assert.assertFalse(driving.isTaskExecuted());
    }
}
