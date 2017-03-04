package com.codeclan.example.fantasy_zoo;

import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

public class Enclosure {

    private String name;
    private ArrayList<Beast> beasts;

    public Enclosure (String name) {
        this.name = name;
        this.beasts = new ArrayList<Beast>();
        addBeasts();
    }

    private void addBeasts() {
    }


//    public String getName() {
//
//    }
}
