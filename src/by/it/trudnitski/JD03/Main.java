package by.it.trudnitski.JD03;

import static by.it.trudnitski.JD03.Util.*;

public class Main {
    public static void main(String[] args) {
        double[][] arr = initializationArr();
        arrayPrinter(arr);
        arifmeticalGeometrical(arr);
        minMaxValue(arr);
        arrayPrinter(matrixTransponent(arr));
        localMin(arr);
        localMax(arr);

    }
}
