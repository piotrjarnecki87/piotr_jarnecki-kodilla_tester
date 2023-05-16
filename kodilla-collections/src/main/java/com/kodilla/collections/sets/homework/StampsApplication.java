package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stampsStamp = new HashSet<>();
        stampsStamp.add(new Stamp("Znaczek01", 20/30, "yes" ));
        stampsStamp.add(new Stamp("Znaczek02", 30/25, "no"));
        stampsStamp.add(new Stamp("Znaczek03", 30/25, "no"));
        stampsStamp.add(new Stamp("Znaczek03", 30/25, "no"));
        stampsStamp.add(new Stamp("Znaczek03", 30/25, "no"));
        stampsStamp.add(new Stamp("Znaczek01", 20/30, "yes" ));
        stampsStamp.add(new Stamp("Znaczek04", 25/25, "yes" ));

        System.out.println(stampsStamp.size());
        for (Stamp stamp : stampsStamp)
            System.out.println(stamp);
    }
    }

