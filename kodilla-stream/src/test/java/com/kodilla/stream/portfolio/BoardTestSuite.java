package com.kodilla.stream.portfolio;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class BoardTestSuite {
    public Board prepareTestData() {
        //users
        User user1 = new User("developer1", "John Smith");
        User user2 = new User("projectmanager1", "Nina White");
        User user3 = new User("developer2", "Emilia Stephenson");
        User user4 = new User("developer3", "Konrad Bridge");
        //tasks
        Task task1 = new Task("Microservices for taking temperature", "Write and test the microservice taking" + "the temperature from external service", user1, user2, LocalDate.now().minusDays(20), LocalDate.now().plusDays(30));
        Task task2 = new Task("HQLs for analysis", "Prepare some HQL queries for analysis", user1, user2, LocalDate.now().minusDays(20), LocalDate.now().minusDays(5));
        Task task3 = new Task("Temperature entity", "Prepare entity for temperatures", user3, user2, LocalDate.now().minusDays(20), LocalDate.now().plusDays(15));
        Task task4 = new Task("Own logger", "Refractor company logger to meet our needs", user3, user2, LocalDate.now().minusDays(10), LocalDate.now().plusDays(25));
        Task task5 = new Task("Optimize searching", "Archive data searching have to be optimized", user4, user2, LocalDate.now(), LocalDate.now().plusDays(5));
        Task task6 = new Task("Use streams", "Use streams rather than for-loops in predictions", user4, user2, LocalDate.now().minusDays(15), LocalDate.now().minusDays(2));
        //taskLists
        TaskList taskListToDo = new TaskList("To do");
        taskListToDo.addTask(task1);
        taskListToDo.addTask(task3);
        TaskList taskListInProgress = new TaskList("In Progress");
        taskListInProgress.addTask(task5);
        taskListInProgress.addTask(task4);
        taskListInProgress.addTask(task2);
        TaskList taskListDone = new TaskList("done");
        taskListDone.addTask(task6);
        //board
        Board project = new Board("Project Weather Prediction");
        project.addTaskList(taskListToDo);
        project.addTaskList(taskListDone);
        project.addTaskList(taskListInProgress);
        return project;
    }

    @Test
    public void testAddTaskList() {
        //Given
        Board project = prepareTestData();
        //when
        //then
        Assert.assertEquals(3, project.getTaskLists().size());
    }
    @Test
    public void testAddTaskListFindUsersTasks(){
        //Given
        Board project = prepareTestData();
        //When
        User user = new User("developer1","John Smith");
        List<Task> tasks = project.getTaskLists().stream()
                .flatMap(l->l.getTasks().stream())
                .filter(t->t.getAssignedUser().equals(user))
                .collect(Collectors.toList());
        //then
        Assert.assertEquals(2,tasks.size());
        Assert.assertEquals(user,tasks.get(0).getAssignedUser());
        Assert.assertEquals(user,tasks.get(1).getAssignedUser());
    }
}



