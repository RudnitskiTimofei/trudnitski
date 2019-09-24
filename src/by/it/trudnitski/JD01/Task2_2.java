package by.it.trudnitski.JD01;


import java.util.Scanner;

public class Task2_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter dragon age ");
        int year = sc.nextInt();
        howMuchHeadsAndEyes(year);
    }

    private static void howMuchHeadsAndEyes(int year) {
        int head = 3;
        int eyes;
        int countEyesOnHead = 2;
        int _200 = 3 * 200;
        int _200_300 = 100 * 2;

        if (year <= 200) {
            head += year * 3;
            eyes = head * countEyesOnHead;
            System.out.println(" Dragon have " + head + " heads and " + eyes + " eyes ");
        } else if (year <= 300) {
            head += _200 + ((year - 200) * 2);
            eyes = head * countEyesOnHead;
            System.out.println(" Dragon have " + head + " heads and " + eyes + " eyes ");
        } else {
            head += _200 + _200_300 + (year - 300);
            eyes = head * countEyesOnHead;
            System.out.println(" Dragon have " + head + " heads and " + eyes + " eyes ");
        }
    }
}
