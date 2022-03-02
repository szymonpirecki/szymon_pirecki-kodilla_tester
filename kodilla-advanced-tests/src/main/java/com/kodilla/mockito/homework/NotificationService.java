package com.kodilla.mockito.homework;

import java.util.*;
import java.util.stream.Collectors;

public class NotificationService {


    private Map<String, Set<User>> users = new HashMap<>();


    public void addUser(User user, String region) {

        if (users.containsKey(region)) {
            users.get(region).add(user);
        } else {
            Set<User> subscribers = new HashSet<>();
            subscribers.add(user);
            users.put(region, subscribers);
        }

    }


    public void sendMonitToAllSubscribers(Monit monit) {
        Set<User> allUsers = new HashSet<>();
        allUsers = users.values().stream().flatMap(Set::stream).collect(Collectors.toSet());
        for (User user : allUsers) {
            user.receive(monit);
        }
    }


    public void removeUserFrom(User user, String region) {
        if (users.containsKey(region)) {
            users.get(region).remove(user);
        }
    }

    public void archiveUser(User user) {
        for (Map.Entry<String, Set<User>> note : users.entrySet()) {
            if (note.getValue().contains(user)) {
                note.getValue().remove(user);
            }
        }
    }


    public void notifyUserFrom(Monit monit, String region) {
        for (User user : users.getOrDefault(region, Collections.emptySet())) {
            user.receive(monit);
        }
    }
}
