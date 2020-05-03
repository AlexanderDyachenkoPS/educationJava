package com.example.education.practice004;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SnilsValidator {

    private String snilsPattern = "(\\d)(\\d)(\\d)-(\\d)(\\d)(\\d)-(\\d)(\\d)(\\d)\\s(\\d\\d)";
    private Pattern pattern = Pattern.compile(snilsPattern);

        private boolean checkSum (int snilsSum, int lastDigits){
            int snilsSumCalculated;

            if (snilsSum < 100) { snilsSumCalculated = snilsSum;}
            else if (snilsSum == 100 || snilsSum == 101) { snilsSumCalculated = 0;}
            else { snilsSumCalculated = snilsSum%101; }

            return (snilsSumCalculated == lastDigits);
        }

        public boolean validate(String snils) {

            Matcher matcher = pattern.matcher(snils);
            if (matcher.find()) {
                return true;
            } else {
                return false;
            }
        }

        public boolean snilsCheckSum(String snils) {

            Matcher matcher = pattern.matcher(snils);

            if (matcher.find()) {
                int sum = 0;
                for (int i=1; i<10; i++) {
                   sum += Integer.parseInt(matcher.group(i))*(10-i);
                }
                return checkSum(sum, Integer.parseInt(matcher.group(10)) );

            } else {
                return false;
            }


        }

}
