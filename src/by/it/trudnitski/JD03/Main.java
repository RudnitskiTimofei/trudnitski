package by.it.trudnitski.JD03;

import static by.it.trudnitski.JD03.Util.*;

public class Main {
    public static void main(String[] args) {
        double[][] arr = initializationArr();
        printer(arr);
        arifmeticalGeometrical(arr);
        minMaxValue(arr);
        printer(matrixTransponent(arr));


    }
}
