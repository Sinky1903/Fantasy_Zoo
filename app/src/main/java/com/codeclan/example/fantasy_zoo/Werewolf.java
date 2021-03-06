package com.codeclan.example.fantasy_zoo;

import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

public class Werewolf extends Beast implements Hairyable {

    public Werewolf (String name, int age) {
        super("Scott Howard", 17);
        this.belly = new ArrayList<Edible>();
    }

    public int checkBelly() {
        return belly.size();
    }

    @Override
    public void eat(Edible food) {
        if(food instanceof Heart) {
            belly.add(food);
            System.out.println("Bloody Hearts!!!");
        }else{
            System.out.println("Get me hearts or i'll rip yours out!");
        }
    }
}
