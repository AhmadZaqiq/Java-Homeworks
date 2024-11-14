package com.mycompany.exercise6;

import java.util.Scanner;

public class Exercise6 {

    public static void readArray(int arr2D[][]) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.println("Enter Number: ");

                arr2D[i][j] = scanner.nextInt();
            }
        }
    }

    public static void arrColsSum(int arr2D[][]) {

        for (int i = 0; i < 4; i++) {

            int colSum = 0;

            for (int j = 0; j < 3; j++) {

                colSum += arr2D[j][i];

            }

            arr2D[3][i] = colSum;
        }

    }

    public static void displayArray(int arr2D[][]) {

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.print(arr2D[i][j] + " ");

            }

            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int arr2D[][] = new int[4][4];

        readArray(arr2D);

        arrColsSum(arr2D);

        displayArray(arr2D);
    }
}
