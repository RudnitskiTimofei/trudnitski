package by.it.trudnitski.Library.InOut;

import java.util.List;

public class Printer {

    public static void printListOfBooks(List list){

        for (Object o : list) {
            System.out.println(o);
        }

    }
}
