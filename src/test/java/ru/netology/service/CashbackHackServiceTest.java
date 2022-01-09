package ru.netology.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void RemainLessAmount1000() {
        int amount = 900;
        int expected = 100;

        CashbackHackService сashbackHackService = new CashbackHackService();
        int actual = сashbackHackService.remain(amount);
        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void RemainMoreAmount1000() {
        int amount = 1500;
        int expected = 500;

        CashbackHackService сashbackHackService = new CashbackHackService();
        int actual = сashbackHackService.remain(amount);
        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void RemainAmount1000() {
        int amount = 1000;
        int expected = 0;

        CashbackHackService сashbackHackService = new CashbackHackService();
        int actual = сashbackHackService.remain(amount);
        assertEquals(actual, expected);

    }
}