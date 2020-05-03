package com.example.education.practice003;

import java.util.ArrayList;

public class LongArray {

    private static int getSize(int n) {
        int s=0;
        for (int i = 1; i <= n; i ++) {
            s += i;
        }
        return s;
    }

    public static int[] formArray(int n) {
        int size = getSize(n);
        int[] array = new int[size];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i+1; j++) {
                array[idx]=j;
                idx++;
            }
        }
        return array;
    }
}
