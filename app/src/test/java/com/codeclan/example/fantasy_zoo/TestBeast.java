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
    Apple apple;
    Heart heart;


    @Before
    public void before() {

        dragon = new Dragon("Bob", 200);
        unicorn = new Unicorn("Yolanda", 8);
        werewolf = new Werewolf("Scott Howard", 17);
        legomen = new Legomen();
        apple = new Apple();
        heart = new Heart();
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
    public void testDragonCanBreath(){
        assertEquals("woooooosa", dragon.breath());
    }

    @Test
    public void testDragonCanSleep() {
        assertEquals("zzzzzz", dragon.sleep());
    }

    @Test
    public void testDragonBellyEmpty() {
        assertEquals(0, dragon.checkBelly());
    }

    @Test
    public void testDragonCanEatLegomen() {
        dragon.eat(legomen);
        assertEquals(1, dragon.checkBelly());
    }

    @Test
    public void testDragonCantEatApple() {
        dragon.eat(apple);
        assertEquals(0, dragon.checkBelly());
    }

    @Test
    public void testDragonCanFly() {
        assertEquals("My big wings make me fly!", dragon.fly());
    }

    @Test
    public void testGetUnicornName() {
        assertEquals("Yolanda", unicorn.getName());
    }

    @Test
    public void testGetUnicornAge() {
        assertEquals(8, unicorn.getAge());
    }

    @Test
    public void testUnicornCanBreath(){
        assertEquals("woooooosa", unicorn.breath());
    }

    @Test
    public void testUnicornCanSleep() {
        assertEquals("zzzzzz", unicorn.sleep());
    }

    @Test
    public void testUnicornBellyEmpty() {
        assertEquals(0, unicorn.checkBelly());
    }

    @Test
    public void testUnicornCanEatApple() {
        unicorn.eat(apple);
        assertEquals(1, unicorn.checkBelly());
    }

    @Test
    public void testUnicornCantEatLegomen() {
        unicorn.eat(legomen);
        assertEquals(0, unicorn.checkBelly());
    }

    @Test
    public void testUnicornCanFly() {
        assertEquals("My magical horn makes me flyyyyyyyy!", unicorn.fly());
    }

    @Test
    public void testGetWerewolfName() {
        assertEquals("Scott Howard", werewolf.getName());
    }

    @Test
    public void testGetWerewolfAge() {
        assertEquals(17, werewolf.getAge());
    }

    @Test
    public void testWerewolfCanBreath(){
        assertEquals("woooooosa", werewolf.breath());
    }

    @Test
    public void testWerewolfCanSleep() {
        assertEquals("zzzzzz", werewolf.sleep());
    }

    @Test
    public void testWerewolfBellyEmpty() {
        assertEquals(0, werewolf.checkBelly());
    }

    @Test
    public void testWerewolfCanEatHeart() {
        werewolf.eat(heart);
        assertEquals(1, werewolf.checkBelly());
    }

    @Test
    public void testWerewolfCantEatLegomen() {
        werewolf.eat(legomen);
        assertEquals(0, werewolf.checkBelly());
    }

}
