package by.it.trudnitski.JD02;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter first number: ");
        int a = sc.nextInt();
        System.out.println(" Enter second number: ");
        int b = sc.nextInt();
        friendlyNumbers(a, b);

    }

    private static void friendlyNumbers(int a, int b) {
        int count = 0;

        for (int i = a; i < b; i++) {
            for (int j = a + 1; j < b; j++) {
                if ((findSum(j) == i) & (findSum(i) == j)) {
                    System.out.println(i + " and " + j + " Are friendly numbers ");
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println(" in this zone haven't friendly numbers ");
        }
    }

    private static int findSum(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
