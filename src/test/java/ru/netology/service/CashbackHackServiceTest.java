package ru.netology.service;

import static org.junit.Assert.*;

import  org.junit.Test;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testRemain() {
        int amount = 900;
        int expected = 100;

        CashbackHackService сashbackHackService = new CashbackHackService();
        int actual = сashbackHackService.remain(amount);
        assertEquals(actual, expected);

    }
    @org.junit.Test
    public void testRemainMoAmount1000() {
        int amount = 1500;
        int expected = 500;

        CashbackHackService сashbackHackService = new CashbackHackService();
        int actual = сashbackHackService.remain(amount);
        assertEquals(actual, expected);

    }
    @org.junit.Test
    public void testRemainAmount1000() {
        int amount = 1000;
        int expected = 0;

        CashbackHackService сashbackHackService = new CashbackHackService();
        int actual = сashbackHackService.remain(amount);
        assertEquals(actual, expected);

    }

}

