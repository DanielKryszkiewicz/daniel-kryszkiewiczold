package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        String taskToDo = "to do";
        String taskInProgress = "in progress";
        String taskDone = "done";
        board.getToDoList().addTask(taskToDo);
        board.getInProgressList().addTask(taskInProgress);
        board.getDoneList().addTask(taskDone);

        //Then
        Assert.assertEquals("to do", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("in progress", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("done", board.getDoneList().getTasks().get(0));
    }
}