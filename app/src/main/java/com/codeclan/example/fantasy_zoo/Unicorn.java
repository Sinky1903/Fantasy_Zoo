package com.codeclan.example.fantasy_zoo;

import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

public class Unicorn extends Beast {

    private ArrayList<Edible> belly;
    
    public Unicorn(String name, int age) {
        super("Yolanda", 8);
        this.name = name;
        this.age = age;
        this.belly = new ArrayList<Edible>();
    }

//    public String breath() {
//        return "hhhhmmmmmmm";
//    }

    public String eat() {
        return "yummmmmmmie";
    }

    public String sleep() {
        return "zzzzzzz";
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

    public void eat(Edible food) {
        belly.add(food);
    }
}
