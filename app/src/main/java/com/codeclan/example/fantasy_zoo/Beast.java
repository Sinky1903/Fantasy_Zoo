package com.codeclan.example.fantasy_zoo;

import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

public abstract class Beast {

    private String name;

    private int age;

    protected ArrayList<Edible> belly;

    public abstract void eat(Edible food);

    public Beast(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String breath() {
        return "woooooosa";
    }

    public String sleep() {
        return "zzzzzz";
    }


}


