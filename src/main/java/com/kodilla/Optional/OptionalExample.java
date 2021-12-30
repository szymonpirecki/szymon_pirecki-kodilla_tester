package com.kodilla.Optional;

import com.kodilla.stream.User;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User("user1", 30, 100, "Test"); //null;

        Optional<User> optionalUser = Optional.ofNullable(user);

        optionalUser.ifPresent(u -> System.out.println(u.getUserName()));
      //  System.out.println(optionalUser.orElse(new User("przemek",0,0,"")).getUserName());
    }
}
