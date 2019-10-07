package by.it.trudnitski.Library.InOut;

import java.util.ArrayList;

public class Printer {

    public static void printListOfBooks(ArrayList arrayList){

        for (Object o : arrayList) {
            System.out.println(o);
        }

    }
}
