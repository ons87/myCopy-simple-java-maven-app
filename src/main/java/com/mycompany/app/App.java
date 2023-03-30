package com.mycompany.app;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
    }


    public static int countStars(String[] list) {
        int result = 0;
        for(int i =0; i < list.length -1 ; i++){
            if(list[i].equals("*") && list[i+1].equals("*")){
                result++;
                i++;
            }
        }
        return result;
    }

    public String getMessage() {
        return MESSAGE;
    }
}
