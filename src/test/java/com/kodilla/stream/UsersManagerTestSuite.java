package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UsersManagerTestSuite {

    @Test
    public void testFilterChemistGroupUsernames() {
        //given
        //when
        List<String> result = UsersManager.filterChemistGroupUsernames();
        //then
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Walter White");
        expectedList.add("Gale Boetticher");
        assertEquals(expectedList, result);
    }

    @Test
    public void testFilterUsersOlderThan_35(){
        //given
        //when
        List<User> result = UsersManager.filterUsersOlderThan(35);
        //then
        List <User> expectedList = new ArrayList<>();
        expectedList.add(new User("Walter White", 50, 7, "Chemists"));
        expectedList.add(new User("Gus Firing", 49, 0, "Board"));
        expectedList.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        expectedList.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
                assertEquals(expectedList, result);
    }

    @Test
    public void testFilterUsersOlderThan_MinusOne() {
        //given
        //when
        List<User> result = UsersManager.filterUsersOlderThan(-1);
        //then
        List<User> expectedList = new ArrayList<>();
        expectedList.add(new User("Walter White", 50, 7, "Chemists"));
        expectedList.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        expectedList.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        expectedList.add(new User("Gus Firing", 49, 0, "Board"));
        expectedList.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        expectedList.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        assertEquals(expectedList, expectedList);
    }

        @Test
        public void testFilterUsersOlderThan_0() {
            //given
            //when
            List<User> result = UsersManager.filterUsersOlderThan(0);
            //then
            List<User> expectedList = new ArrayList<>();
            expectedList.add(new User("Walter White", 50, 7, "Chemists"));
            expectedList.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
            expectedList.add(new User("Tuco Salamanca", 34, 116, "Manager"));
            expectedList.add(new User("Gus Firing", 49, 0, "Board"));
            expectedList.add(new User("Gale Boetticher", 44, 2, "Chemists"));
            expectedList.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
            assertEquals(expectedList, result);
        }

    @Test
    public void testFilterUsersOlderThan_57() {
        //given
        //when
        List<User> result = UsersManager.filterUsersOlderThan(57);
        //then
        List<User> expectedList = new ArrayList<>();
        assertEquals(expectedList, result);
    }

    @Test
    public void testFilterUsersOlderThan_58() {
        //given
        //when
        List<User> result = UsersManager.filterUsersOlderThan(58);
        //then
        List<User> expectedList = new ArrayList<>();
        assertEquals(expectedList, result);
    }

    @Test
    public void testDisplayUsersGroups() {
        //given
        //when
        List<String> result = UsersManager.displayUsersGroups();
        //then
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Chemists");
        expectedList.add("Sales");
        expectedList.add("Manager");
        expectedList.add("Board");
        expectedList.add("Chemists");
        expectedList.add("Security");
        assertEquals(expectedList, result);
    }
}