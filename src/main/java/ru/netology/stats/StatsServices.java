package ru.netology.stats;

public class StatsServices {

    public long sumPraces(long[] sales) {
        int sumAll = 0;
        for (long sum : sales) {
            sumAll += sum;
        }
        return sumAll;
    }

    public long averagePrice(long[] sales) {
        long sumAll = sumPraces(sales);
        return sumAll / sales.length;
    }

//    public long maxPrice(long[] sales){
//        long max = sales[0];
//        for (long sale : sales){
//            if(max < sale){
//                max = sale;
//            }
//        }
//        return max;
//    }
//
//    public long minPrice(long[] sales){
//        long min = sales[0];
//        for (long sale : sales){
//            if(min > sale){
//                min = sale;
//            }
//        }
//        return min;
//    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int lessAverageSales(long[] sales) {
        int i = 0; // Переменная подсчета количества месяцев
        for (long sale : sales) {
            if (sale < averagePrice(sales)) {
                i = i + 1; // Считаем месяцы в диапазоне продаж ниже среднего
            }
        }
        return i;
    }

    public int moreAverageSales(long[] sales) {
        int i = 0; // Переменная подсчета количества месяцев
        for (long sale : sales) {
            if (sale > averagePrice(sales)) {
                i = i + 1; // Считаем месяцы в диапазоне продаж выше среднего
            }
        }
        return i;
    }

}
