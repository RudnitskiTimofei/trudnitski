package by.it.trudnitski.JD02;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter 2 natural numbers: ");
        int number = sc.nextInt();
        int number2 = sc.nextInt();
        printer(number, number2);
    }

    private static int countOfDigits(int a) {
        int count = (a == 0) ? 1 : 0;
        while (a!=0){
            count++;
            a/=10;
        }
        return count;
    }

    private static boolean isPallindrom(int a) {

        String string = String.valueOf(a);
        return string.equals(new StringBuilder().append(string).reverse().toString());

    }

    private static int maxDigit(int number) {

        return number == 0 ? 0 : Math.max(number % 10, maxDigit(number / 10));
    }

    private static boolean simpleOrNot(int a) {
        int res = 0;
        int half = a / 2;
        boolean result = false;

        for (int i = 1; i <= half; i++) {
            if (a % i == 0) {
                res++;
            }
        }
        if (res == 1 | a == 1) {
            result = true;
        }

        return result;
    }

    private static int nod(int a, int b) {

        return b == 0 ? a : nod(b, a % b);
    }

    private static int nok(int a, int b) {

        return a / nod(a, b) * b;
    }

    private static StringBuilder simpleDiv(int a) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i < a / 2; i++) {
            if (a % i == 0 & simpleOrNot(i)) {
                stringBuilder.append(i).append(" ");
            }
        }
        return stringBuilder;
    }

    private static void printer(int a, int b) {
        if (simpleOrNot(a)) {
            System.out.println(" Number #1 is simple ");
        } else {
            System.out.println(" Number #1 is not simple");
        }
        System.out.println(" Simple divisor of number #1: " + simpleDiv(a));
        System.out.println(" Max digit of number #1: " + maxDigit(a));
        System.out.println(" Greatest Common Divisor: " + nod(a, b));
        System.out.println(" Lowest Common Multiple: " + nok(a, b));

        if (isPallindrom(a)) {
            System.out.println(" Number is pallindrom ");
        } else {
            System.out.println(" Number is not pallindrom ");
        }
        System.out.println(" Count of digits in number: " + countOfDigits(a));
    }
}
