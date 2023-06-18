package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

public class ForumStats {


    public static double avgOlderThen40() {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(User::getAge)
                .average()
                .getAsDouble();
    }

    public static double avgYoungerThen40() {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(User::getAge)
                .average()
                .getAsDouble();
    }

    public static void main(String[] args) {
        System.out.println("Średnia liczba postów dl użytkowników >=40: " + avgOlderThen40());
        System.out.println("Średnia liczba postów dl użytkowników <40: " + avgYoungerThen40());
    }
}