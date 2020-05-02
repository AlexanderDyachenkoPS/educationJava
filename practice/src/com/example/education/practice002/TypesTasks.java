package com.example.education.practice002;

import java.time.LocalDate;

import static java.time.temporal.TemporalAdjusters.firstDayOfYear;

public class TypesTasks {

    public void  task1(byte a) {
        System.out.println(Integer.toBinaryString(a & 0xFF));
    }

    public void  task2() {

        int a = 46362;
        int b = 1074717522;
        float c = (float) b / ((float)a * (float)a);
        double d = 5e-3f + 5e-2f + c;
        System.out.println((float)d);

    }

    public void  task3() {

        int a = 0;
        int b = (byte) a + 46;
        byte c = (byte) (a * b);
        double f = (char) 1234.15;
        long d = (long) (a + f / c + b);
        System.out.println(d);


    }

    public void  task4() {

        int a = 44;
        int b = 300;
        short c = (short) (b - a);
        System.out.println(c);

    }

    public void task5(int a) {

        if ((a&(a-1))==0) {
            System.out.println(a +" is a power of 2");
        } else {

            System.out.println(a + " is not a power of 2");
        }

    }

    public void NYDay(int years) {
        System.out.println(LocalDate.now().plusYears(years).with(firstDayOfYear()).getDayOfWeek());
    }
}
