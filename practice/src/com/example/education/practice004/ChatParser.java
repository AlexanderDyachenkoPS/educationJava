package com.example.education.practice004;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChatParser {

    String regexpPattern = "^(.*)\\:\\s(.*)$";

    private String formMessagesByNickName (Map hashmap) {

        StringBuilder output = new StringBuilder("");
        Iterator iterator = hashmap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry)iterator.next();
            output.append(mapElement.getKey()).append(":\n").append(mapElement.getValue());
        }
        return output.toString();
    }


    public String printNickChatting(String[] nickNames, String[] textLines) {

        Map<String, StringBuilder> hashmap = new HashMap<>();
        Pattern pattern =  Pattern.compile(regexpPattern);

        for (int i=0; i < nickNames.length; i++) {
            hashmap.put(nickNames[i], new StringBuilder(""));
        }


        for (int i=0; i < textLines.length; i++) {

            Matcher matcher = pattern.matcher(textLines[i]);
            if (matcher.find()) {
                hashmap.put(matcher.group(1),hashmap.get(matcher.group(1)).
                        append(i+1 +")").
                        append(matcher.group(2)).
                        append("\n")
                );
            }
        }


        return formMessagesByNickName(hashmap);

    }

}
