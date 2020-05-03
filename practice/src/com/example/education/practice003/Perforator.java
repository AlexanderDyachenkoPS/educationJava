package com.example.education.practice003;


public class Perforator {

    public static void comparePerf () {
        int n = 10000000;   //количество элементов массива
        long begin;         // начальное время
        long end;           // конечное время
        double avgTime;
        int[] array = new int[n];
        for (int i = 0, s = 0; i < n; i++) {
            array[i] += i;
        }

        long current = System.nanoTime();

        int[] clonedArray = array.clone();

        System.out.println("Clone in " + (System.nanoTime()-current) + " nanos");

        int[] copiedArray = new int[n];

        current = System.nanoTime();

        System.arraycopy(array,0,copiedArray,0,n);

        System.out.println("System.arraycopy in " + (System.nanoTime()-current) + " nanos");

        int[] copiedArrayManual = new int[n];

        current = System.nanoTime();

        for (int j = 0; j < n; j++) {
            copiedArrayManual[j] = array [j];
        }

        System.out.println("Manual array copy in " + (System.nanoTime()-current) + " nanos");

    }
}
