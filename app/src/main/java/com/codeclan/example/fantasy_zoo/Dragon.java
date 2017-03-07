package com.codeclan.example.fantasy_zoo;

import java.sql.SQLOutput;
import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

public class Dragon extends Beast implements Flyable{


    public Dragon(String name, int age) {
        super("Bob", 201);
        this.belly = new ArrayList<Edible>();
    }

    public int checkBelly() {
       return belly.size();
    }

    @Override
    public void eat(Edible food) {
        if(food instanceof Legomen || food instanceof Unicorn) {
            belly.add(food);
            System.out.println("oh yes my fave!");
        }else{
            System.out.println("Give me proper food FFS!");
        }
    }

    public String attackUnicorn() {
        return ("Attack pesky Unicorn!!");
    }

    public String fly() {
        return "My big wings make me fly!";
    }

    public String eatUnicorn(Unicorn unicorn) {
        belly.add(unicorn);
        return "Mmmmm bye bye Unicorn!";
    }
}
