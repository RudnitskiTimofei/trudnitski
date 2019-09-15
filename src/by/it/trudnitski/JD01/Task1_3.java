package by.it.trudnitski.JD01;


public class Task1_3 {

    public static void main(String[] args) {

        double R1 = 18.50;
        double R2 = 14.30;
        double square1 = 3.14 * Math.pow(R1, 2);
        double square2 = 3.14 * Math.pow(R2, 2);
        double ringSquare = square1 - square2;
        System.out.println(" Площадь круга большего радиуса " + square1);
        System.out.println(" Площадь круга меньшего радиуса " + square2);
        System.out.println(" Площадь кольца " + ringSquare);

    }
}
