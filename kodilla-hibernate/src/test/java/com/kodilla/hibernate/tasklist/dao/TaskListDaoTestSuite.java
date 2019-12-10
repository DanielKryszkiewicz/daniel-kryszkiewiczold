package com.kodilla.hibernate.tasklist.dao;

import org.springframework.test.context.ContextConfiguration;


import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)

@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String description = "Learn Hibernate part 2";
    private static final String listName = "listName";


    @Test
    public void testFindByListName() {
        //When
        TaskList taskList = new TaskList(description,listName);
        taskListDao.save(taskList);
        //Then
        String listName = taskList.getListName();
        List<TaskList> readTaskList = taskListDao.findByListName(listName);
        Assert.assertEquals("LISTNAME",readTaskList.get(0).getListName());
        //Cleanup
        taskListDao.delete(taskList);

    }
}
