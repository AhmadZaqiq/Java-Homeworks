package com.mycompany.exercise7;

import java.util.Scanner;

public class Exercise7 {

    public static char readChar(String Message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(Message);
        char ch = scanner.next().charAt(0);
        return ch;
    }

    public static String readString(String Message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(Message);
        String s = scanner.nextLine();
        return s;
    }

    public static int countChar(String Word, char Letter) {

        int Counter = 0;

        for (int i = 0; i < Word.length(); i++) {

            if (Word.charAt(i) == Letter) {
                Counter++;
            }
        }

        return Counter;
    }

    public static void main(String[] args) {

        char Letter = readChar("Enter Letter to Find: ");
        String Word = readString("Enter Word: ");
        int Counter = countChar(Word, Letter);

        System.out.print("Letter " + Letter + " repeats in " + Word + " {" + Counter + "} times");

    }
}
