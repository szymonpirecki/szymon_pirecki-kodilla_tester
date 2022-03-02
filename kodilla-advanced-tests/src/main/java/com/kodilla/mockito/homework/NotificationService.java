package com.kodilla.mockito.homework;

import java.util.*;

public class NotificationService {

    private Set<User> north = new HashSet<>();
    private Set<User> east = new HashSet<>();
    private Set<User> south = new HashSet<>();
    private Set<User> west = new HashSet<>();
    private Set<User> all = new HashSet<>();
    private Map<String, Set<User>> users = new HashMap<>();

    public void addUser(User user, String region) {
        switch (region) {
            case "north":
                north.add(user);
                users.put("N", north);
            case "east":
                east.add(user);
                users.put("E", east);
            case "south":
                south.add(user);
                users.put("S", south);
            case "west":
                west.add(user);
                users.put("W", west);
        }
        all.add(user);
        users.put("A", all);
    }

    public void sendMonitToAllSubscribers(Monit monit) {
        for (User user : users.getOrDefault("A", Collections.emptySet())) {
            user.receive(monit);
        }
    }

    public void removeUserFrom(User user, String region) {
        switch (region) {
            case "north":
                users.get("N").remove(user);
            case "east":
                users.get("E").remove(user);
            case "south":
                users.get("S").remove(user);
            case "west":
                users.get("W").remove(user);
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
        Set<User> notified = new HashSet<>();
        switch (region) {
            case "north":
                notified = users.get("N");
                break;
            case "east":
                notified = users.get("E");
                break;
            case "south":
                notified = users.get("S");
                break;
            case "west":
                notified = users.get("W");
                break;
        }
        if (!notified.isEmpty()) {
            for (User user : notified) {
                user.receive(monit);
            }
        }
    }
}
