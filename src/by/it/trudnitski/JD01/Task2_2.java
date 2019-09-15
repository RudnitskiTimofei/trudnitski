package by.it.trudnitski.JD01;


import java.util.Scanner;

public class Task2_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите возраст дракона ");
        int year = sc.nextInt();
        int start = 3;
        int _200 = 3 * 200;
        int _200_300 = 100 * 2;
        int result;

        if (year <= 200) {
            result = year * 3 + start;
            System.out.println("У дракона " + result + " голов ");
        } else if (year <= 300) {
            result = _200 + start + ((year - 200) * 2);
            System.out.println("У дракона " + result + " голов ");
        } else {
            result = _200 + _200_300 + start + (year - 300);
            System.out.println(" У дракона " + result + " голов ");
        }

    }
}
