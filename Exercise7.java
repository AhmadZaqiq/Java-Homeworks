package com.mycompany.exercise7;

import java.util.Scanner;

public class Exercise7 {

    public static char readChar(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        char ch = scanner.next().charAt(0);
        return ch;
    }

    public static String readString(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        String s = scanner.nextLine();
        return s;
    }

    public static int countChar(String word, char letter) {

        int counter = 0;

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == letter) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {

        char letter = readChar("Enter Letter to Find: ");
        String word = readString("Enter Word: ");
        int counter = countChar(word, letter);

        System.out.print("Letter " + letter + " repeats in " + word + " {" + counter + "} times");

    }
}
