package ru.Netology;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;


public class StatisticsServiceTest {
    StatisticsService service = new StatisticsService();

    @Test
    public void findMax() {


        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void findMaxZiro() {


        long[] incomesInBillions = {-12, -5, -8, -4, -5, -3, -8, -6, -11, -11, 0};
        long expected = 0;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void findMaxAbc() {


        long[] incomesInBillions = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}