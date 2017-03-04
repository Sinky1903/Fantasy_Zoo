package com.codeclan.example.fantasy_zoo;

/**
 * Created by user on 03/03/2017.
 */

public abstract class Beast {

    public String name;

    public int age;

    public abstract String breath();

    public abstract String eat();

    public abstract String sleep();


    public Beast(String name, int age) {
        this.name = name;
        this.age = age;

    }
}


