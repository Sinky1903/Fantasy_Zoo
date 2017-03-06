package com.codeclan.example.fantasy_zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 03/03/2017.
 */

public class TestZoo {

    Enclosure enclosure;
    Zoo zoo;

    @Before
    public void before() {

        enclosure = new Enclosure("Flying Squad");
        zoo = new Zoo("Zoo");
    }

    @Test
    public void testGetName() {
        assertEquals("Zoo", zoo.getName());
    }

    @Test
    public void testNoEclosures() {
        assertEquals(0, zoo.checkEnclosures());
    }

    @Test
    public void testEnclosureAdded() {
        zoo.addEnclosureToZoo(enclosure);
        assertEquals(1, zoo.checkEnclosures());
    }
}
