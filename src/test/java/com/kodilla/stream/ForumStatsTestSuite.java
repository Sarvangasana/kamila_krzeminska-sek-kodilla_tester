package com.kodilla.stream;

import com.kodilla.stream.homework.ForumStats;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStatsTestSuite {

    @Test
    public void testAverageNumberOfPostsInGroupOf_up_to_40_yrsOld() {
        //given
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 30, "Chemists"));
        users.add(new User("Jessie Pinkman", 42, 4, "Sales"));
        users.add(new User("Tuco Salamanca", 40, 140, "Manager"));
        users.add(new User("Gus Firing", 38, 7, "Board"));
        users.add(new User("Gale Boetticher", 39, 40509, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 41, 506, "Security"));
        //when
        double result = ForumStats.averageNumberOfPostsInGroupOf_under_40_yrsOld(users);
        //then
        double expected = 20258.0;
        assertEquals(expected, result);
    }

    @Test
    public void testAverageNumberOfPostsInGroupOf_40_yrsOld_or_Elder() {
        // given
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 30, "Chemists"));
        users.add(new User("Jessie Pinkman", 42, 4, "Sales"));
        users.add(new User("Tuco Salamanca", 40, 140, "Manager"));
        users.add(new User("Gus Firing", 38, 7, "Board"));
        users.add(new User("Gale Boetticher", 39, 40509, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 41, 506, "Security"));
        //when
        double result = ForumStats.averageNumberOfPostsInGroupOf_40_yrsOld_or_Elder(users);
        //then
        double expected = 170.0;
        assertEquals(expected, result);
    }
}
