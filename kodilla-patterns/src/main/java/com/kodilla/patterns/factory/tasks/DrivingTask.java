package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;
    private boolean isExecuted;

    public DrivingTask(final String taskName, final String where, final String using,boolean isExecuted){
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.isExecuted = false;
    }

    @Override
    public void executeTask() {
        isExecuted = true;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }
}
