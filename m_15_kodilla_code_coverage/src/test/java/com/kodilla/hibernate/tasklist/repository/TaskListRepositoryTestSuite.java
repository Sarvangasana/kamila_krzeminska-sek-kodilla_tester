package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;


    @Test
    void taskListRepositoryFindByListName() {
        //Given
        TaskList taskList1 = new TaskList("ToDo", "Walk a dog");
        TaskList taskList2 = new TaskList("ToDo", "Clean the house");
        TaskList taskList3 = new TaskList("Done", "Learn English");
        taskListRepository.save(taskList1);
        taskListRepository.save(taskList2);
        taskListRepository.save(taskList3);
        String listName1 = taskList1.getListName();
        String listName2 = taskList2.getListName();
        String listName3 = taskList3.getListName();

        //When
        List<TaskList> readTasksLists = taskListRepository.findByListName("ToDo");
        List<TaskList> readDoneTasksLists = taskListRepository.findByListName("Done");

        //Then
        Assertions.assertEquals(2, readTasksLists.size());
        Assertions.assertEquals(1, readDoneTasksLists.size());

        //CleanUp
        int id1 = readTasksLists.get(0).getId();
        int id2 = readTasksLists.get(1).getId();
        int id3 = readDoneTasksLists.get(0).getId();
        taskListRepository.deleteById(id1);
        taskListRepository.deleteById(id2);
        taskListRepository.deleteById(id3);
    }
}
