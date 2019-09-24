package by.it.trudnitski.JD01;


public class Task1_3 {

    public static void main(String[] args) {
        double R1 = 18.50;
        double R2 = 14.30;
        squareOfTheRing(R1, R2);


    }

    private static void squareOfTheRing(double r1, double r2) {
        double PI=3.1415;
        double square1 = PI * Math.pow(r1, 2);
        double square2 = PI * Math.pow(r2, 2);
        double ringSquare = square1 - square2;
        System.out.println(" Площадь круга большего радиуса " + square1);
        System.out.println(" Площадь круга меньшего радиуса " + square2);
        System.out.println(" Площадь кольца " + ringSquare);
    }
}
