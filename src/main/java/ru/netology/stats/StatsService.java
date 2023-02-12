package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result = result + sale;


        }
        return result;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;

    }

    public int MonthMinSales(long[] sales) {
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

    public int MonthMaxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int CalcMonthSaleBellowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < average((sales))) {
                counter++;
            }

        }
        return counter;

    }
    public int CalcMonthSaleAboveAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > average((sales))) {
                counter++;
            }

        }
        return counter;
    }

    }
