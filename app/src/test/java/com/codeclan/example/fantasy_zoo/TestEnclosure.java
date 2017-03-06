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
    Werewolf werewolf;
    Werewolf werewolf2;
    FlyingEnclosure flyingenclosure;
    NonFlyingEnclosure nonFlyingEnclosure;


    @Before
    public void before() {

        dragon = new Dragon("Bob", 201);
        dragon2 = new Dragon("jeffrey", 402);
        unicorn = new Unicorn("Yolanda", 8);
        werewolf = new Werewolf("Scott Howard", 17);
        werewolf2 = new Werewolf("Michael Corvin", 28);
        flyingenclosure = new FlyingEnclosure("Flying Squad");
        nonFlyingEnclosure = new NonFlyingEnclosure("Hairy Bikers");

    }

    @Test
    public void testGetFlyingEnclosureName() {
        assertEquals("Flying Squad", flyingenclosure.getName());
    }

    @Test
    public void testFlyingEnclosureEmpty() {
        assertEquals(0, flyingenclosure.checkEnclosure());
    }

    @Test
    public void testAddToFlyingEnclosure() {
        flyingenclosure.addBeastToEnclosure(dragon);
        assertEquals(1, flyingenclosure.checkEnclosure());
    }

//    @Test
//    public void testAddToFlyingEnclosure2(){
//        int originalLength = flyingenclosure.checkEnclosure();
//        flyingenclosure.addFlyingBeastToEnclosure(dragon);
//        flyingenclosure.addFlyingBeastToEnclosure(unicorn);
//        assertEquals(originalLength + 2, flyingenclosure.checkEnclosure());
//    }

    @Test
    public void testCanFeedFlyingAnimals() {
        Legomen legomen = new Legomen();
        flyingenclosure.addBeastToEnclosure(dragon);
        flyingenclosure.addBeastToEnclosure(dragon2);
        flyingenclosure.addBeastToEnclosure(unicorn);
        flyingenclosure.addBeastToEnclosure(werewolf);
        flyingenclosure.feedanimals(legomen);
        assertEquals(1, dragon.checkBelly());
        assertEquals(1, dragon2.checkBelly());
        assertEquals(0, unicorn.checkBelly());
    }

//    @Test
//    public void testFlyingEnclosureCanAddDragonOrUnicorn() {
//
//    }

    @Test
    public void testGetNonFlyingEnclosureName() {
        assertEquals("Hairy Bikers", nonFlyingEnclosure.getName());
    }

    @Test
    public void testNonFlyingEnclosureEmpty() {
        assertEquals(0, nonFlyingEnclosure.checkEnclosure());
    }

    @Test
    public void testAddToNonFlyingEnclosure() {
        nonFlyingEnclosure.addBeastToEnclosure(werewolf);
        assertEquals(1, nonFlyingEnclosure.checkEnclosure());
    }

    @Test
    public void testCanFeedNonFlyingAnimals() {
        Legomen legomen = new Legomen();
        Heart heart = new Heart();
        nonFlyingEnclosure.addBeastToEnclosure(werewolf);
        nonFlyingEnclosure.addBeastToEnclosure(werewolf2);
        nonFlyingEnclosure.feedanimals(legomen);
        nonFlyingEnclosure.feedanimals(heart);

        assertEquals(1, werewolf.checkBelly());
        assertEquals(1, werewolf2.checkBelly());
    }

}
