package by.it.trudnitski.JD02;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter first number: ");
        int a = sc.nextInt();
        System.out.println(" Enter second number: ");
        int b = sc.nextInt();
        friendlyOrNot(a, b);

    }

    private static void friendlyOrNot(int a, int b) {
        int halfA = a / 2;
        int halfB = b / 2;
        int resultA = 0;
        int resultB = 0;

        for (int i = 1; i <= halfA; i++) {
            if (a % i == 0) {
                resultA += i;
            }
        }

        for (int j = 1; j <= halfB; j++) {
            if (b % j == 0) {
                resultB += j;
            }
        }

        if (resultA == b & resultB == a) {
            System.out.println(" numbers is friendly ");
        } else {
            System.out.println(" numbers is not friendly ");
        }
    }
}
