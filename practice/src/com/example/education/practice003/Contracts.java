package com.example.education.practice003;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contracts {

    private static String regexp4Region = "\\d\\d\\d\\d(\\d\\d)\\d\\d\\d\\d\\d";
    private static String regexp4Count = "\\d\\d\\d\\d\\d\\d(\\d\\d\\d)\\d\\d";



    public static void parse() {

        Map<Integer, Integer> hashmap = new HashMap<>();
        Pattern pattern4Region = Pattern.compile(regexp4Region);
        Pattern pattern4Count = Pattern.compile(regexp4Count);


        List<String> rawArray =  new ArrayList<String>(Arrays.asList("85080473104", "20470810710", "67380581309", "53001582606",
                    "48201702305", "21610343308", "87310652801", "97801961912",
                    "54171573511", "39561410912", "11941311809", "44677392502",
                    "42528377612", "58879103612", "55758121301", "28197032810",
                    "99807815107", "56538719602", "89498500712", "24868203501",
                    "71238933112", "61557888212"));
        for (int i = 0; i < rawArray.size(); i ++) {

            String s = rawArray.get(i);
            Matcher matcher4Region  = pattern4Region.matcher(s);
            Matcher matcher4Count = pattern4Count.matcher(s);

            if (matcher4Region.find() && matcher4Count.find()) {
                hashmap.put(
                               Integer.parseInt(matcher4Region.group(1)),
                               hashmap.containsKey(Integer.parseInt(matcher4Region.group(1))) ?
                                                                                                hashmap.get(Integer.parseInt(matcher4Region.group(1))) + Integer.parseInt(matcher4Count.group(1)) : Integer.parseInt(matcher4Count.group(1))
                );
            }
        }
        System.out.println(hashmap.toString());
    }
}
