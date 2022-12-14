package com.kevinbooms.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dictionary {

    // Found this problem on a Youtube mock interview
    // Given a dictionary of words, and a word as input, return true or false depending on whether or not
    // the word input is found in the dictionary.
    // 7/7/2022 - Made basic concept. Could still be refined for case sensitivity.

    public static void main(String[] args) {

        List<String> dictionary = new ArrayList<>();
        dictionary.add("Cat");
        dictionary.add("Car");
        dictionary.add("Bar");

        boolean isInDict = false;

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a word to search the dictionary for.");
        String word = userInput.nextLine();

        for (int i = 0; i < dictionary.size(); i++) {
            if (dictionary.get(i).contains(word)) {
                isInDict = true;
            }
        }
        System.out.println(isInDict);
    }


}
