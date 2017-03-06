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

    public int checkEnclosure() {
        return beasts.size();
    }

//    public void addFlyingBeastToEnclosure(Beast b) {
//        return beasts.add(b);
//    }

    @Override
    public void addBeastToEnclosure(Beast b) {
        if(b instanceof Dragon || b instanceof Unicorn) {
            beasts.add(b);
            System.out.println("Fly Away!");
        }else{
            System.out.println("Sorry you're not equipped to fly!");
        }
    }

//    @Override
//    public void addToEnclosure(Edible food) {
//        if(food instanceof Legomen) {
//            belly.add(food);
//            System.out.println("oh yes my fave!");
//        }else{
//            System.out.println("Give me proper food FFS!");
//        }
//    }



}
