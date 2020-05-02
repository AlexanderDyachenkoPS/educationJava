package com.example.education.practice004;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palindrome {

    private String regexpPattern = "[^a-zA-Z0-9]";

    public boolean checkPalindrome (String palindrome) {

        return palindrome.replaceAll(regexpPattern,"").toString().equals(
        new StringBuilder(palindrome.replaceAll(regexpPattern, "")).reverse().toString());
    }
}
