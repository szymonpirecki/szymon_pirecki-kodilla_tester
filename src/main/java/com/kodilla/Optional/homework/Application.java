package com.kodilla.Optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Application {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("alex", null));
        students.add(new Student("laura", new Teacher("roger")));
        students.add(new Student("tom", new Teacher("adam")));
        students.add(new Student("bob", null));
        students.add(new Student("josh",new Teacher("jan")));


        for(Student student : students){
            Teacher undefinedTeacher = new Teacher("<undefined>") ;
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());

            System.out.println("Student: " + student.getName() + ", Teacher: " + optionalTeacher.orElse(undefinedTeacher).getName());
        }

        }
    }

