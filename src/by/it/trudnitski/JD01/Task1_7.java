package by.it.trudnitski.JD01;

public class Task1_7 {

    public static void main(String[] args) {
        int a = 5;
        int b = 12;
        change(a, b);
    }

    private static void change(int a, int b) {
        System.out.println(" Int a = " + a + "\n" + " Int b = " + b);
        a = a + b;
        b -= a;
        b = -b;
        a -= b;
        System.out.println(" After change ");
        System.out.println(" Int a = " + a);
        System.out.println(" Int b = " + b);
    }
}
