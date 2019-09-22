package by.it.trudnitski.JD02;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your number: ");

        headsAndTails(sc.nextInt());
    }

    private static void headsAndTails(int times) {
        int tails = 0;
        int howMuchHeads = 0;
        int howMuchTails = 0;

        for (int i = 0; i < times; i++) {
            int result = (int) (Math.random() * 2);
            if (result > tails) {
                howMuchHeads++;
            } else {
                howMuchTails++;
            }
        }

        System.out.println(" After " + times + " repeat " + howMuchHeads + " heads ");
        System.out.println(" After " + times + " repeat " + howMuchTails + " tails ");
    }
}
