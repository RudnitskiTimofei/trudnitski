package by.it.trudnitski.JD01;

import java.util.Scanner;

public class Task2_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter is vowel: ");
        char input = sc.nextLine().toLowerCase().toCharArray()[0];
        isVowel(input);
    }

    private static void isVowel(char input) {
        switch (input) {
            case 'e':
            case 'y':
            case 'u':
            case 'i':
            case 'o':
            case 'a':
                System.out.println(" Symbol " + input + " is vowel ");
            break;
            default:
                System.out.println(" Symbol is not vowel ");
        }
    }
}
