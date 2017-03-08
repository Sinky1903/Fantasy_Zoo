package com.codeclan.example.fantasy_zoo;

import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

public abstract class Enclosure {

    private String name;

    protected ArrayList<Beast> beasts;

    public abstract void addBeastToEnclosure(Beast b);
    
    public Enclosure (String name) {
        this.name = name;
    }

    public int checkEnclosure() {
        return beasts.size();
    }

    public void removeBeastFromEnclosure(Beast b) {
        this.beasts.remove(b);
    }

    public void feedAnimals(Edible food) {
        for (Beast beast : beasts) {
            beast.eat(food);
        }
    }

    public String getName() {
        System.out.println(name);
        return name;
    }
}
