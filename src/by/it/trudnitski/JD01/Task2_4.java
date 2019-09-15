package by.it.trudnitski.JD01;

import java.util.Scanner;

public class Task2_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите день ");
        int day = sc.nextInt();
        System.out.println(" Введите месяц ");
        int month = sc.nextInt();
        System.out.println(" Введите год ");
        int year = sc.nextInt();

        if (day == 28 && month == 2 && year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            day++;
            System.out.println(" Дата следующего дня " + day + " : " + month + " : " + year);

        } else if (day == 31 && month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
            day = 1;
            month++;
            System.out.println(" Дата следующего дня " + day + " : " + month + " : " + year);

        } else if (day == 30 && month == 4 || month == 6 || month == 9 || month == 11) {
            day = 1;
            month++;
            System.out.println(" Дата следующего дня " + day + " : " + month + " : " + year);
        } else if (day >= 28 && month == 2) {
            day = 1;
            month++;
            System.out.println(" Дата следующего дня " + day + " : " + month + " : " + year);
        } else if (day == 31 && month == 12) {
            day = 1;
            month = 1;
            year++;
            System.out.println(" Дата следующего дня " + day + " : " + month + " : " + year);
        } else {
            day++;
            System.out.println(" Дата следующего дня " + day + " : " + month + " : " + year);
        }

    }

}
