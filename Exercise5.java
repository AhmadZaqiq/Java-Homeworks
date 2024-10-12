package com.mycompany.exercise5;

import java.util.Random;
import java.util.Scanner;

public class Exercise5 {

    public static void fillRandomMarks(int MarksArr[]) {

        Random random = new Random();

        for (int i = 0; i < MarksArr.length; i++) {
            MarksArr[i] = 60 + random.nextInt(41);
        }
    }

    public static void printRandomMarks(int MarksArr[]) {

        System.out.print("Marks: ");

        for (int i = 0; i < MarksArr.length; i++) {

            System.out.print(MarksArr[i] + " ");
        }

        System.out.print("\n");
    }

    public static float calculateSum(int MarksArr[]) {

        float Sum = 0;

        for (int i = 0; i < MarksArr.length; i++) {

            Sum += MarksArr[i];
        }

        return Sum;
    }

    public static float calculateAverage(int MarksArr[]) {

        return (calculateSum(MarksArr) / MarksArr.length);
    }

    public static void main(String[] args) {

        int[] MarksArr = new int[10];

        fillRandomMarks(MarksArr);

        printRandomMarks(MarksArr);

        System.out.print("Avg: {" + calculateAverage(MarksArr) + "}");

    }
}
