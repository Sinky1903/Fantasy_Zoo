package com.codeclan.example.fantasy_zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 03/03/2017.
 */

public class TestEnclosure {

    Dragon dragon;
    Dragon dragon2;
    Unicorn unicorn;
    Enclosure enclosure;


    @Before
    public void before() {

        dragon = new Dragon("Bob", 201);
        dragon2 = new Dragon("jeffrey", 402);
        unicorn = new Unicorn("Yolanda", 8);
        enclosure = new Enclosure("Flying Squad");
    }

    @Test
    public void testGetName() {
        assertEquals("Flying Squad", enclosure.getName());
    }

    @Test
    public void testEnclosureEmpty() {
        assertEquals(0, enclosure.checkEnclosure());
    }

    @Test
    public void testAddToEnclosure(){
        int originalLength = enclosure.checkEnclosure();
        enclosure.addBeastToEnclosure(dragon);
        enclosure.addBeastToEnclosure((unicorn));
        assertEquals(originalLength + 2, enclosure.checkEnclosure());
    }

    @Test
    public void testCanFeedAnimals() {
        Legomen legomen = new Legomen();
        enclosure.addBeastToEnclosure(dragon);
        enclosure.addBeastToEnclosure(dragon2);
        enclosure.addBeastToEnclosure(unicorn);
        enclosure.feedanimals(legomen);
        assertEquals(1, dragon.checkBelly());
        assertEquals(1, dragon2.checkBelly());
        assertEquals(0, unicorn.checkBelly());
    }

//    @Test
//    public void testFlyingEnclosureCanAddDragonOrUnicorn() {
//
//    }

}
