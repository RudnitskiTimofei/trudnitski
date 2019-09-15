package by.it.trudnitski.JD01;

import java.util.Scanner;

public class Task2_3_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите гласную букву ");
        char input = sc.nextLine().toLowerCase().toCharArray()[0];
        char[] variant = {'ё', 'у', 'е', 'ы', 'а', 'о', 'э', 'я', 'и', 'ю'};
        boolean flag = false;
        for (char c : variant) {
            if (c == input) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println(" Символ является гласной буквой ");
        } else {
            System.out.println(" Симвой не является гласной буквой ");
        }
    }
}
