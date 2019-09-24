package by.it.trudnitski.JD01;

public class Task1_6 {

    public static void main(String[] args) {
        int n = 3659876;
        revers(n);
    }

    private static void revers(int n) {
        StringBuilder sb = new StringBuilder();
        System.out.println("Before reverse: " + n);

        while (n > 0) {
            sb.append(n % 10);
            n /= 10;
        }
        System.out.println(" After reverse: " + sb);

    }
}
