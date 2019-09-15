package by.it.trudnitski.JD01;

import java.util.Scanner;

public class Task2_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите гласную букву ");
        char input = sc.nextLine().toLowerCase().toCharArray()[0];

        switch (input) {
            case 'у': {
            }
            case 'е': {
            }
            case 'ы': {
            }
            case 'а': {
            }
            case 'о': {
            }
            case 'э': {
            }
            case 'я': {
            }
            case 'и': {
            }
            case 'ю': {
            }
            case 'ё': {
                System.out.println(" Символ " + input + " гласная буква ");
            }
            break;
            default: {
                System.out.println(" Символ не является гласной буквой");
            }

        }

    }

}
