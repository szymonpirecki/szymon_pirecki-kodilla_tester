package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {

        List<String> userNames = UserRepository.getUserList()
                .stream()
                .filter(u -> u.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)//getter z user?
                .collect(Collectors.toList());
        System.out.println(userNames);

    }

    public static String getUserName(User user) {
        return user.getUserName();
    }
}
