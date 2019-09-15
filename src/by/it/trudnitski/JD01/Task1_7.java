package by.it.trudnitski.JD01;

public class Task1_7 {

    public static void main(String[] args) {

        int a = 5;
        int b = 12;

        a = a + b;
        b -= a;
        b = -b;
        a -= b;

        System.out.println(a);
        System.out.println(b);

    }
}
