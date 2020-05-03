package com.example.education.practice003;

import java.util.ArrayList;
import java.util.List;

public class Compress {

    public static ArrayList<Integer> compress(ArrayList<Integer> arrayList) {

        ArrayList<Integer>  arrayListCompressed = new ArrayList<Integer> ();
        int group = 0;
        int groupSize = 0;
        for (int i = 0; i<arrayList.size(); i++) {
            if (i == 0) {
                group = arrayList.get((Integer) i);
                groupSize += 1;
            }
            else if (i > 0 && arrayList.get(i-1) == arrayList.get(i)) {
                group = arrayList.get((Integer) i);
                groupSize += 1;
            } else {
                arrayListCompressed.add(group);
                arrayListCompressed.add(groupSize);
                group = arrayList.get(i);
                groupSize = 1;
            }
            if (i == arrayList.size()-1) {
                arrayListCompressed.add(group);
                arrayListCompressed.add(groupSize);
            }
        }
        return arrayListCompressed;
    }

    public static ArrayList<Integer> decompress(ArrayList<Integer> arrayList) {

        ArrayList<Integer>  arrayListDecompressed = new ArrayList<Integer> ();

        for (int i = 1; i < arrayList.size(); i += 2) {
            for (int j = 0; j < arrayList.get(i); j ++) {
                arrayListDecompressed.add(arrayList.get(i-1));
            }
        }

        return arrayListDecompressed;
    }


}
