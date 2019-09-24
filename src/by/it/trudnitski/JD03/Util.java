package by.it.trudnitski.JD03;

import java.util.Random;
import java.util.Scanner;

class Util {

    static double[][] initializationArr() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter count of row: ");
        int x = sc.nextInt();
        System.out.println(" Enter count of column: ");
        int y = sc.nextInt();
        Random random = new Random();
        double[][] array = new double[x][y];

            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    array[i][j] = random.nextDouble();
                }
            }
        return array;
    }

    static void minMaxValue(double[][] array) {
        double min = array[0][0];
        double max = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (max < array[i][i]) {
                    max = array[i][j];
                }
                if (min > array[i][j]) {
                    min = array[i][j];
                }
            }
        }
        System.out.println(" Min value: " + min);
        System.out.println(" Max value: " + max);
        System.out.println();
    }

    static void arifmeticalGeometrical(double[][] array) {
        double arifmetic = 0.0;
        double geometric = 1.0;
        double count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                count++;
                arifmetic += array[i][j];
                geometric *= array[i][j];
            }
        }
        double pow = 1.0 / count;
        arifmetic = arifmetic / count;
        geometric = Math.pow(geometric, pow);
        System.out.println(" Arifmetical: " + arifmetic);
        System.out.println(" Geometrical: " + geometric);
        System.out.println();
    }

    static double[][] matrixTransponent(double[][] array) {
        double[][] trans = new double[array[0].length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                trans[j][i] = array[i][j];
            }
        }
        return trans;
    }

    static void printer(double[][] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                count++;
                System.out.printf("%4f ", array[i][j]);
                if (count % array[0].length == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println();
    }
}
