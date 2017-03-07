package com.codeclan.example.fantasy_zoo;

import java.util.ArrayList;

/**
 * Created by user on 06/03/2017.
 */

public class FlyingEnclosure extends Enclosure {

    Dragon dragon;
    Unicorn unicorn;

    public FlyingEnclosure(String name) {
        super("Flying Enclosure");
        this.name = name;
        this.beasts = new ArrayList<Beast>();
    }

    public String getName() {
        return name;
    }

//    public int checkEnclosure() {
//        return beasts.size();
//    }

    @Override
    public void addBeastToEnclosure(Beast b) {
        if(b instanceof Flyable) {
            beasts.add(b);
            System.out.println("Fly Away!");
        }else{
            System.out.println("Sorry you're not equipped to fly!");
        }
    }

}
