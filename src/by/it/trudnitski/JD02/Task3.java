package by.it.trudnitski.JD02;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number ");
        perfectOrNot(sc.nextInt());
    }

    private static void perfectOrNot(int number) {
        int half = number / 2;
        int result = 0;

            for (int i = 1; i <= half; i++) {
                if (number % i == 0) {
                    result += i;
                }
            }

        if (result == number) {
            System.out.println(" number is perfect ");
        } else {
            System.out.println(" number is not perfect ");
        }
    }


}
