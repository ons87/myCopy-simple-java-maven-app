package com.mycompany.app;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        String[] aos = verifyLetters(new String[]{"mot", "salut", "bb"}, "ao");
        Arrays.stream(aos).forEach(s -> System.out.println(s));
    }


    public static String[] verifyLetters(String[] list, String letters) {
        List<String> result = new ArrayList<String>();
        for(int i =0; i < list.length -1; i++){
            String s = list[i];
            char[] chars = letters.toCharArray();
            for(int j = 0 ; j < chars.length; j++){
                if(s.contains(String.valueOf(chars[j]))){
                   result.add(s);
                }
            }
        }
        return result.toArray(new String[0]);
    }

    public String getMessage() {
        return MESSAGE;
    }
}
