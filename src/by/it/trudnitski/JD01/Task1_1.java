package by.it.trudnitski.JD01;


public class Task1_1 {
    public static void main(String[] args) {

        int a = 15;
        int b = 27;
        int c = 6;


        if (a == b & b == c) {
            System.out.println(" Все числа одинаковы ");
        } else if (a != b & b != c & a != c) {
            System.out.println("Все числа различны");
        } else {
            System.out.println("Есть повторенія в чіслах");
        }


    }

}
