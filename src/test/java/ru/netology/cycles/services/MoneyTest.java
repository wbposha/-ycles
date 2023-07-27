package ru.netology.cycles.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyTest{
    @Test
    void ShouldCalculateRest(){
    MoneyTest service = new MoneyTest();

    long income = 10000;
    long expenses = 3000;
    long threshold = 20000;
    long expected = 3;

    int actual = service.calculate(income, expenses, threshold);

    Assertions.assertEquals(expected, actual);

    }

    @Test
    void ShouldCalculateRestWithAnotherNumb(){
        MoneyTest service = new MoneyTest();

        long income = 100000;
        long expenses = 60000;
        long threshold = 150000;
        long expected = 2;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }
}