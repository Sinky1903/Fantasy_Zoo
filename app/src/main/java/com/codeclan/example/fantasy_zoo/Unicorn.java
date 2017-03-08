package com.codeclan.example.fantasy_zoo;

import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

public class Unicorn extends Beast implements Flyable, Edible{

    
    public Unicorn(String name, int age) {
        super("Yolanda", 8);
        this.belly = new ArrayList<Edible>();
    }

    public int checkBelly() {
        return belly.size();
    }

    @Override
    public void eat(Edible food) {
        if(food instanceof Apple) {
            belly.add(food);
            System.out.println("yummers");
        }else{
            System.out.println("I won't eat this");
        }
    }

    public String fly() {
        System.out.println("My magical horn makes me flyyyyyyyy!");
        return "My magical horn makes me flyyyyyyyy!";
    }

    public String fart() {
        System.out.println("RAINBOW FART");
        return "RAINBOW FART";
    }
}
