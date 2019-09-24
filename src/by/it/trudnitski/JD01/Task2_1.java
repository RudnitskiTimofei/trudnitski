package by.it.trudnitski.JD01;

public class Task2_1 {
    public static void main(String[] args) {
        int x1 = 2;
        int x2 = 2;
        int x3 = 8;
        int y1 = 2;
        int y2 = 8;
        int y3 = 2;
        triangleOrNot(x1,x2,x3,y1,y2,y3);
    }

    private static void triangleOrNot(int x1, int x2, int x3, int y1, int y2, int y3) {
        double a = Math.abs((x2 - x1) + (y2 - y1));
        double b = Math.abs((x3 - x2) + (y3 - y2));
        double c = Math.abs((x3 - x1) + (y3 - y1));
        double res1 = (x2 - x1) * (y3 - y1);
        double res2 = (x3 - x1) * (y2 - y1);

        if (res1 - res2 != 0) {
            System.out.println(" Its triangle ");
            if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                System.out.println(" Triangle with 90^ ");
            } else if (Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)){
                System.out.println(" Triangle with 90^ ");
            } else if (Math.pow(c, 2) + Math.pow(b, 2) == Math.pow(a, 2)){
                System.out.println(" Triangle with 90^ ");
            }
        } else {
            System.out.println(" Its not triangle ");
        }
    }
}
