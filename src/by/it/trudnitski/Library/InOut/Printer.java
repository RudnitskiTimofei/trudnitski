package by.it.trudnitski.Library.InOut;

import java.util.List;

public class Printer {

    public static void printListOfBooks(List list){
        if (list.isEmpty()){
            System.out.println(" We can't find books with your's param");
        }

        for (Object o : list) {
            System.out.println(o);
        }

    }
}
