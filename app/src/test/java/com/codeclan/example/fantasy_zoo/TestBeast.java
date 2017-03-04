package com.codeclan.example.fantasy_zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 03/03/2017.
 */

public class TestBeast {

    Dragon dragon;
    Unicorn unicorn;
    Werewolf werewolf;
    Legomen legomen;


    @Before
    public void before() {

        dragon = new Dragon("Bob", 200);
        unicorn = new Unicorn();
        werewolf = new Werewolf();
    }

    @Test
    public void testGetDragonName() {
        assertEquals("Bob", dragon.getName());
    }

    @Test
    public void testGetDragonAge() {
        assertEquals(200, dragon.getAge());
    }

    @Test
    public void testDragonBellyEmpty() {
        assertEquals(0, dragon.checkBelly());
    }

    @Test
    public void testDragonCanEat() {
        dragon.eat(legomen);
        assertEquals(1, dragon.checkBelly());
    }



//    @Test
//    public void testDragonCanFly() {
//    }
}
