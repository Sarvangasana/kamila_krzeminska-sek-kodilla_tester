package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);

        List<User> usersOlderThan35 = filterUsersOlderThan(35);
        System.out.println(usersOlderThan35);

        List<String> userGroups = displayUsersGroups();
        System.out.println(userGroups);
}
    public static List<String> filterChemistGroupUsernames() {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
    }

    public static List<User> filterUsersOlderThan(int age) {
        List<User> users = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
        return users;
    }

    public static List<String> displayUsersGroups() {
        List<String> usersGroups = UsersRepository.getUsersList()
                .stream()
                .map (user -> user.getGroup())
                .collect(Collectors.toList());
        return usersGroups;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}
