package com.codeclan.example.fantasy_zoo;

import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

public abstract class Beast {

    public String name;

    public int age;

    protected ArrayList<Edible> belly;

    public String breath() {
        return "woooooosa";
    }

    public abstract String sleep();


    public Beast(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(Edible food) {
        belly.add(food);
    }
}


