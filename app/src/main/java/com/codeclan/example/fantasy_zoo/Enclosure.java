package com.codeclan.example.fantasy_zoo;

import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

public class Enclosure {

    public String name;
    protected ArrayList<Beast> beasts;


    public Enclosure (String name) {
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

    public void feedanimals(Edible food) {
        for (Beast beast : beasts) {
            beast.eat(food);
        }
    }
}
