package com.kodilla.patterns.prototype;


import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;


public class BoardTestSuite {
    @Test
    public void testToString(){
        //given
        //creating the TasksList for todos
        TasksList listToDo = new TasksList("To do");
        IntStream.iterate(1, n->n+1)
                .limit(10)
                .forEach(n->listToDo.getTasks().add(new Task("To Do Task number"+n)));

        //creating the TaskList for task in progress
        TasksList listInProgress = new TasksList("In Progress Task");
        IntStream.iterate(1,n->n+1)
                .limit(10)
                .forEach(n->listInProgress.getTasks().add(new Task("In Progress Task number"+n)));

        //creating the TaskList for done tasks
        TasksList listDone = new TasksList("Done Tasks");
        IntStream.iterate(1,n->n+1)
                .limit(10)
                .forEach(n->listDone.getTasks().add(new Task("Done Task number"+n)));
        //creating the Board and assigning to the list
        Board board = new Board("Project number 1");
        board.getLists().add(listToDo);
        board.getLists().add(listInProgress);
        board.getLists().add(listDone);
        //making a shallow clone of object board
        Board clonedBoard = null;
        try {
            clonedBoard = board.shallowCopy();
            clonedBoard.setName("Project number 2");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        System.out.println(board);
        System.out.println(clonedBoard);

        //When
        //Then
        Assert.assertEquals(3,board.getLists().size());
        Assert.assertEquals(3,clonedBoard.getLists().size());

    }
}
