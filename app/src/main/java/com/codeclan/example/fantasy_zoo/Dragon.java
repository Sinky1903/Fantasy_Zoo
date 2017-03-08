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
        System.out.println("Attack pesky Unicorn!!");
        return "Attack pesky Unicorn!!";
    }

    public String eatUnicorn(Unicorn unicorn) {
        belly.add(unicorn);
        System.out.println("Mmmmm bye bye Unicorn!");
        return "Mmmmm bye bye Unicorn!";
    }

    public String fly() {
        System.out.println("My big wings make me fly!");
        return "My big wings make me fly!";
    }
}
