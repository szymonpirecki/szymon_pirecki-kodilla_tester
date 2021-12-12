package com.kodilla.stream.homework;

import com.kodilla.stream.UserRepository;

public class ForumStats {
    public static void main(String[] args) {
      double averageNumberOfOldPeoplesPosts = UserRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map (n -> n.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("osoba po 40 roku zycia srednio dodala na tym forum: " + averageNumberOfOldPeoplesPosts + " postów.");

        double averageNumberOfYoungPeoplesPosts =UserRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(n -> n.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("osoba przed 40 rokiem zycia srednio dodala na tym forum: " + averageNumberOfYoungPeoplesPosts + "postów.");
    }
}
