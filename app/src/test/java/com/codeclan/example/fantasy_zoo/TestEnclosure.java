package com.codeclan.example.fantasy_zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 03/03/2017.
 */

public class TestEnclosure {

    Dragon dragon;
    Unicorn unicorn;
    Enclosure enclosure;


    @Before
    public void before() {

        enclosure = new Enclosure("Flying Squad");
        dragon = new Dragon("Bob", 201);
        unicorn = new Unicorn("Yolanda", 8);
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
    public void testAddToEnclosure() {
        beasts.add();
    }

}
