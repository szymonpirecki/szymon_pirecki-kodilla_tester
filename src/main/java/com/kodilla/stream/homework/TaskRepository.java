package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
public static List<Task> getTasks(){
    List<Task> tasks = new ArrayList<>();
    tasks.add(new Task("christmasCleaning", LocalDate.of(2021,12,20), LocalDate.of(2021,12,19)));
    tasks.add(new Task("christmasShopping", LocalDate.of(2021,12,12), LocalDate.of(2021,12,24)));
    tasks.add(new Task("christmasCooking", LocalDate.of(2021,12,22), LocalDate.of(2021,12,24)));
    tasks.add(new Task("cleaningAfterChristmass", LocalDate.of(2021,12,25), LocalDate.of(2021,12,26)));
    tasks.add(new Task("changeTires", LocalDate.of(2021,12,1), LocalDate.of(2021,12,6)));
    return tasks;
}
}
