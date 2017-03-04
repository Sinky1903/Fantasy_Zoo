package com.codeclan.example.fantasy_zoo;

import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

public class Enclosure {

    private String name;
    private ArrayList<Beast> beasts;

    public Enclosure (String name) {
        Enclosure enclosure = new Enclosure("Flying Squad");
        this.name = name;
        this.beasts = new ArrayList<Beast>();
        addBeasts();
    }

    private void addBeasts() {
        beasts.add(new Dragon("Bob", 201) {
            @Override
            public String breath() {
                return null;
            }

            @Override
            public String eat() {
                return null;
            }

            @Override
            public String sleep() {
                return null;
            }
        });
    }


    public String getName() {
        return name;
    }

    public int checkEnclosure() {
        return beasts.size();
    }
}
