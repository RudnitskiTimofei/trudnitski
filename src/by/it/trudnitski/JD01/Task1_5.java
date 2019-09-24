package by.it.trudnitski.JD01;

public class Task1_5 {

    public static void main(String[] args) {
        int n = 345267;
        arifmeticGeometric(n);
    }

    private static void arifmeticGeometric(int n) {
        int[] arr = new int[6];
        double arifmet = 0;
        double geometr = 1;
        double pow = 1.00 / arr.length;

        for (int i = 0; i < 6; i++) {
            arr[i] = n % 10;
            n /= 10;
        }

        for (int value : arr) {
            arifmet = arifmet + value;
            geometr *= value;
        }
        arifmet /= arr.length;
        geometr = Math.pow(geometr, pow);
        System.out.println("Арифметическое среднее: " + arifmet);
        System.out.println("Геометрическое среднее: " + geometr);
    }
}
