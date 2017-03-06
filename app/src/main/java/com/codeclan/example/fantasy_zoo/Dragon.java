package com.codeclan.example.fantasy_zoo;

import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

public class Dragon extends Beast {


    private ArrayList<Edible> belly;

    public Dragon(String name, int age) {
        super("Bob", 201);
        this.name = name;
        this.age = age;
        this.belly = new ArrayList<Edible>();
    }

    public String breath() {
        return "woooooosa";
    }

    public String eat() {
        return "nom nom nom";
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


//    public String fly() {
//        return "";
//    }


}
