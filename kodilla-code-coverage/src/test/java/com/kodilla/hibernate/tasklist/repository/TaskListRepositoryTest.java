package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TaskListRepositoryTest {

    @Autowired
    private TaskListRepository taskListRepository;

    private static final String DESCRIPTION = "test";

    @Test
    void testTaskListRepositoryFindByListName(){
        //given
        TaskList taskList = new TaskList("to do", DESCRIPTION);
        taskListRepository.save(taskList);
        String listName = taskList.getListName();

//        //when
        List<TaskList> readLists = taskListRepository.findByListName("to do");

        //then
        Assertions.assertEquals(1, readLists.size());

        //cleanup
        int id = readLists.get(0).getId();
        taskListRepository.deleteById(id);


    }






}