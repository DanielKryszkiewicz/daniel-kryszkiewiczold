package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String description = "Learn Hibernate part 2";

    @Test
    public void testFindByListName() {
        //When
        TaskList taskList = new TaskList(1,  description,"Hibernate");
        taskListDao.save(taskList);
        //Then
        String listName = taskList.getListName();
        Optional<TaskList> readTaskList = taskListDao.findById(listName);
        Assert.assertTrue(readTaskList.isPresent());
        //Cleanup
        taskListDao.deleteById(listName);

    }
}
