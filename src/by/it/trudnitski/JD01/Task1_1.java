package by.it.trudnitski.JD01;


public class Task1_1 {
    public static void main(String[] args) {
        int a = 15;
        int b = 27;
        int c = 6;
        equalsOrNot(a, b, c);


    }

    private static void equalsOrNot(int a, int b, int c) {
        if (a == b & b == c) {
            System.out.println(" All equals ");
        } else if (a != b & b != c & a != c) {
            System.out.println(" All different ");
        } else {
            System.out.println(" Some repeats ");
        }
    }

}
