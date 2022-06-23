package com.kodilla.stream.homework;

import com.kodilla.stream.User;

import java.util.ArrayList;
import java.util.List;

public class ForumStats {
    public static void main(String[] args) {

        List<User> users1 = new ArrayList<>();
        users1.add(new User("Walter White", 40, 30, "Chemists"));
        users1.add(new User("Jessie Pinkman", 40, 4, "Sales"));
        users1.add(new User("Tuco Salamanca", 40, 140, "Manager"));
        users1.add(new User("Gus Firing", 40, 7, "Board"));
        users1.add(new User("Gale Boetticher", 39, 40509, "Chemists"));
        users1.add(new User("Mike Ehrmantraut", 41, 506, "Security"));
        double averageNumberOfPostsInGroupOf_40_yrsOld_or_Elder = averageNumberOfPostsInGroupOf_40_yrsOld_or_Elder(users1);
        System.out.println(averageNumberOfPostsInGroupOf_40_yrsOld_or_Elder);

        double averageNumberOfPostsInGroupOf_up_to_40_yrsOld = averageNumberOfPostsInGroupOf_under_40_yrsOld(users1);
        System.out.println(averageNumberOfPostsInGroupOf_up_to_40_yrsOld);
    }

   public static double averageNumberOfPostsInGroupOf_40_yrsOld_or_Elder(List<User> users) {
       return users
               .stream()
               .filter(n -> n.getAge() >= 40)
               .mapToInt(User::getNumberOfPost)
               .average()
               .getAsDouble();
    }

   public static double averageNumberOfPostsInGroupOf_under_40_yrsOld(List<User> users) {
       return users
               .stream()
               .filter(n -> n.getAge() < 40)
               .mapToInt(n -> n.getNumberOfPost())
               .average()
               .getAsDouble();
    }
}
