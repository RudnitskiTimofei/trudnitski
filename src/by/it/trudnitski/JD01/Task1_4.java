package by.it.trudnitski.JD01;

public class Task1_4 {

    public static void main(String[] args) {
        int n = 7573;
        rightOrNot(n);
    }

    private static void rightOrNot(int n) {
        int four = n % 10;
        int n1 = n / 10;
        int tree = n1 % 10;
        int n2 = n1 / 10;
        int two = n2 % 10;
        int one = n2 / 10;

        if (one < two & two < tree & tree < four) {
            System.out.println(" Right! ");
        } else if (one > two & two > tree & tree > four) {
            System.out.println(" Right! ");
        } else {
            System.out.println(" Wrong! ");
        }
    }


}
