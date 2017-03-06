package com.codeclan.example.fantasy_zoo;

import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

public class Unicorn extends Beast implements Flyable{

    
    public Unicorn(String name, int age) {
        super("Yolanda", 8);
        this.name = name;
        this.age = age;
        this.belly = new ArrayList<Edible>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
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
            System.out.println("I wont't eat this");
        }
    }

    public String fly() {
        return "My magical horn makes me flyyyyyyyy!";
    }
}
