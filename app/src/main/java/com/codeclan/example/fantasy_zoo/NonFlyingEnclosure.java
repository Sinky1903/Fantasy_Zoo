package com.codeclan.example.fantasy_zoo;

import java.util.ArrayList;

/**
 * Created by user on 06/03/2017.
 */

public class NonFlyingEnclosure extends Enclosure {

    public NonFlyingEnclosure(String name) {
        super("Hairy Bikers");
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
        if(b instanceof Werewolf) {
            beasts.add(b);
            System.out.println("Hunt Away!");
        }else{
            System.out.println("You're not hairy enough for here!");
        }
    }


}
