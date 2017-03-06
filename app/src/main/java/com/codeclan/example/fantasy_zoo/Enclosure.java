package com.codeclan.example.fantasy_zoo;

import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

public class Enclosure {

    private String name;
    private ArrayList<Beast> beasts;

    public Enclosure (String name) {
//        Enclosure enclosure = new Enclosure("Flying Squad");
        this.name = name;
        this.beasts = new ArrayList<Beast>();
    }


    public String getName() {
        return name;
    }

    public int checkEnclosure() {
        return beasts.size();
    }

    public void addBeastToEnclosure(Beast b) {
        this.beasts.add(b);
    }
}
