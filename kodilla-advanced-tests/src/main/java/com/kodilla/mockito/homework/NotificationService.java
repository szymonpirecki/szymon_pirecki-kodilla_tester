package com.kodilla.mockito.homework;

import java.util.*;

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

        if (users.containsKey("allUsers")) {
            users.get("allUsers").add(user);
        } else {
            Set<User> allUsers = new HashSet<>();
            allUsers.add(user);
            users.put("allUsers", allUsers);
        }

    }


    public void sendMonitToAllSubscribers(Monit monit) {
        for (User user : users.getOrDefault("allUsers", Collections.emptySet())) {
            user.receive(monit);
        }
    }

    public void removeUserFrom(User user, String region) {
        users.get(region).remove(user);
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
