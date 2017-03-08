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
    Sasquatch sasquatch;
    FlyingEnclosure flyingenclosure;
    NonFlyingEnclosure nonFlyingEnclosure;


    @Before
    public void before() {

        dragon = new Dragon("Bob", 201);
        dragon2 = new Dragon("jeffrey", 402);
        unicorn = new Unicorn("Yolanda", 8);
        werewolf = new Werewolf("Scott Howard", 17);
        werewolf2 = new Werewolf("Michael Corvin", 28);
        sasquatch = new Sasquatch("Chewbacca", 98);
        flyingenclosure = new FlyingEnclosure("Flying Squad");
        nonFlyingEnclosure = new NonFlyingEnclosure("Hairy Bikers");
    }

//    //////////////

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

    @Test
    public void testRemoveFromFlyingEnclosure() {
        flyingenclosure.addBeastToEnclosure(dragon);
        flyingenclosure.removeBeastFromEnclosure(dragon);
        assertEquals(0, flyingenclosure.checkEnclosure());
    }

//    ////////////

    @Test
    public void testCanFeedFlyingAnimals() {
        Legomen legomen = new Legomen();
        flyingenclosure.addBeastToEnclosure(dragon);
        flyingenclosure.addBeastToEnclosure(dragon2);
        flyingenclosure.addBeastToEnclosure(unicorn);
        flyingenclosure.addBeastToEnclosure(werewolf);
        flyingenclosure.feedAnimals(legomen);
        assertEquals(1, dragon.checkBelly());
        assertEquals(1, dragon2.checkBelly());
        assertEquals(0, unicorn.checkBelly());
        assertEquals(0, werewolf.checkBelly());
    }

//    ///////////////

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
    public void testRemoveFromNonFlyingEnclosure() {
        nonFlyingEnclosure.addBeastToEnclosure(werewolf);
        nonFlyingEnclosure.removeBeastFromEnclosure(werewolf);
        assertEquals(0, nonFlyingEnclosure.checkEnclosure());
    }

//    ////////////

    @Test
    public void testCanFeedAnimals() {
        Chicken chicken = new Chicken();
        nonFlyingEnclosure.addBeastToEnclosure(werewolf);
        nonFlyingEnclosure.addBeastToEnclosure(sasquatch);
        nonFlyingEnclosure.feedAnimals(chicken);
        assertEquals(0, werewolf.checkBelly());
        assertEquals(1, sasquatch.checkBelly());
    }

//    ////////////

    @Test
    public void testDragonAttackUnicorn() {
        unicorn.fart();
        dragon.attackUnicorn();
        unicorn.fly();
        dragon.fly();
        dragon.eatUnicorn(unicorn);
    }


}
