package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("King Bolesław Chrobry", 2.5, 3.5,true));
        stamps.add(new Stamp("Prince Stanisław Poniatowski", 3.0, 4.0, false));
        stamps.add(new Stamp("King Jadwiga Andegaweńska", 3.5, 4.0, true));
        stamps.add(new Stamp("King Bolesław Chrobry", 2.5, 3.5,true));
        stamps.add(new Stamp("King Bolesław Chrobry", 2.5, 3.5,true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
