package com.codeclan.example.fantasy_zoo;

import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

public class Zoo {

    private String name;
    private ArrayList<Enclosure> enclosures;

    public Zoo(String name) {
        this.name = name;
        this.enclosures = new ArrayList<Enclosure>();
    }

    public String getName() {
        return this.name;
    }


    public int checkEnclosures() {
        return enclosures.size();
    }
}
