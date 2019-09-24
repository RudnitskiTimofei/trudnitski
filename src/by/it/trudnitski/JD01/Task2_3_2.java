package by.it.trudnitski.JD01;

import java.util.Scanner;

public class Task2_3_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the vowel ");
        char input = sc.nextLine().toLowerCase().toCharArray()[0];
        isVowel(input);
    }

    private static void isVowel(char input) {
        char[] variant = {'a', 'e', 'y', 'u', 'i','o'};
        boolean flag = false;
        for (char c : variant) {
            if (c == input) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println(" Symbol is vowel ");
        } else {
            System.out.println(" Symbol is not vowel ");
        }
    }
}
