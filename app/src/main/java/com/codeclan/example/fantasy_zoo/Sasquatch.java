package com.codeclan.example.fantasy_zoo;

import java.util.ArrayList;

/**
 * Created by user on 07/03/2017.
 */

public class Sasquatch extends Beast implements Hairyable {

    public Sasquatch (String name, int age) {
        super("Chewbacca", 98);
        this.belly = new ArrayList<Edible>();
    }

    public int checkBelly() {
        return belly.size();
    }

    @Override
    public void eat(Edible food) {
        if(food instanceof Chicken || food instanceof Apple) {
            belly.add(food);
            System.out.println("haaaaaaaaaaaarrrgh");
        }else{
            System.out.println("harrgghh harrgghh harrgghh");
        }
    }
}
