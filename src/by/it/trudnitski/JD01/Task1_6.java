package by.it.trudnitski.JD01;

public class Task1_6 {

    public static void main(String[] args) {

        int n = 3659876;
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(n % 10);
            n /= 10;
        }

        System.out.println(sb);

    }
}
