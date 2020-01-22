package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPINGTASK = "ShopppingTask";
    public static final String DRIVINGTASK = "DrivingTask";
    public static final String PAINTINGTASK = "PaintingTask";

    public final Task taskExecutor(final String taskType) {
        switch (taskType) {
            case SHOPPINGTASK:
                return new ShoppingTask("Food", "Potatoes", 20.0,true);
            case DRIVINGTASK:
                return new DrivingTask("Trip1", "London", "VolvoFH16", true);
            case PAINTINGTASK:
                return new PaintingTask("PaintingJob1", "Blue", "Wall", false);
            default:
                return null;
        }
    }
}


