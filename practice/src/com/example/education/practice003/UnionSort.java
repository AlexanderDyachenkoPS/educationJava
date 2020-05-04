package com.example.education.practice003;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UnionSort {

    public static long[] unionAndSort(long[] a, long[] b) {

        long[] result = new long[a.length + b.length];


        System.arraycopy(a,0,result,0,a.length);
        System.arraycopy(b,0,result,a.length,b.length);

        Arrays.sort(result);
        return result;
    }
}
