package com.example.education.practice004;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palindrome {

    private String regexpPattern = "";

    public void checkPalindrome (String palindrome) {

        String name2ASCII = palindrome.replaceAll("[^\\x00-\\x7F]", "").replaceAll("[\\p{Cntrl}&&[^\r\n\t]]", "").replaceAll("\\p{C}", "");

        Pattern pattern =  Pattern.compile(regexpPattern);
        Matcher matcher = pattern.matcher(name2ASCII);

        if (matcher.find()) {

            System.out.println(matcher.group(0));
        }

    }
}
