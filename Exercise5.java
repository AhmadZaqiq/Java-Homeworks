package com.mycompany.exercise5;

import java.util.Random;
import java.util.Scanner;

public class Exercise5 {

    public static void fillRandomMarks(int marksArr[]) {

        Random random = new Random();

        for (int i = 0; i < marksArr.length; i++) {
            marksArr[i] = 60 + random.nextInt(41);
        }
    }

    public static void printRandomMarks(int marksArr[]) {

        System.out.print("Marks: ");

        for (int i = 0; i < marksArr.length; i++) {

            System.out.print(marksArr[i] + " ");
        }

        System.out.print("\n");
    }

    public static float calculateSum(int marksArr[]) {

        float sum = 0;

        for (int i = 0; i < marksArr.length; i++) {

            sum += marksArr[i];
        }

        return sum;
    }

    public static float calculateAverage(int marksArr[]) {

        return (calculateSum(marksArr) / marksArr.length);
    }

    public static void main(String[] args) {

        int[] marksArr = new int[10];

        fillRandomMarks(marksArr);

        printRandomMarks(marksArr);

        System.out.print("Avg: {" + calculateAverage(marksArr) + "}");

    }
}
