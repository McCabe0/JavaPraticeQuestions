package com.company;

import java.io.BufferedReader;
import java.io.Reader;
import java.util.Scanner;

public class PalindroneFinder {

    private boolean isPalindrone = false;
    private String palidrone = "mum";

    public boolean checkIfPalindrone(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the word you'll like to check: ");
        String userInput = scanner.nextLine().toLowerCase();

        StringBuffer revseringTheString = new StringBuffer(userInput);

       String reverse = String.valueOf(revseringTheString.reverse());

        if (reverse.equals(userInput)){
            return !isPalindrone;
        }else
            return isPalindrone;
    }
}
