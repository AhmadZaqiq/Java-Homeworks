package com.mycompany.exercise6;

import java.util.Scanner;

public class Exercise6 {

    public static void readArray(int Arr2D[][]) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.println("Enter Number: ");

                Arr2D[i][j] = scanner.nextInt();
            }
        }
    }

    public static void arrColsSum(int Arr2D[][]) {

        for (int i = 0; i < 4; i++) {

            int colSum = 0;

            for (int j = 0; j < 3; j++) {

                colSum += Arr2D[j][i];

            }

            Arr2D[3][i] = colSum;
        }

    }

    public static void diplayArray(int Arr2D[][]) {

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.print(Arr2D[i][j] + " ");

            }

            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int Arr2D[][] = new int[4][4];

        readArray(Arr2D);

        arrColsSum(Arr2D);

        diplayArray(Arr2D);
    }
}
