package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServicesTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    @Test
    void sumPraces() {
        StatsServices services = new StatsServices();
        long expected = 180;
        long actual = services.sumPraces(sales);
        assertEquals(expected, actual);
    }

    @Test
    void averagePrice() {
        StatsServices services = new StatsServices();
        long expected = 15;
        long actual = services.averagePrice(sales);
        assertEquals(expected, actual);

    }

//   @Test
//   void maxPrice() {
//       StatsServices services = new StatsServices();

//       long expected = 20;
//       long actual = services.maxPrice(sales);
//       assertEquals(expected,actual);

//   }

//   @Test
//   void minPrice() {
//       StatsServices services = new StatsServices();

//       long expected = 7;
//       long actual = services.minPrice(sales);
//       assertEquals(expected,actual);
//   }

    @Test
    void monthMaxPrice() {
        StatsServices services = new StatsServices();
        long expected = 8;
        long actual = services.maxSales(sales);
        assertEquals(expected, actual);

    }

    @Test
    void monthMinPrice() {
        StatsServices services = new StatsServices();
        long expected = 9;
        long actual = services.minSales(sales);
        assertEquals(expected, actual);

    }

    @Test
    void lessrAveragePrice() {
        StatsServices services = new StatsServices();
        long expected = 5;
        long actual = services.lessAverageSales(sales);
        assertEquals(expected, actual);

    }

    @Test
    void moreAveragePrice() {
        StatsServices services = new StatsServices();
        long expected = 5;
        long actual = services.moreAverageSales(sales);
        assertEquals(expected, actual);

    }

}