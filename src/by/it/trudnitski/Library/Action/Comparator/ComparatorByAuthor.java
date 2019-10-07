package by.it.trudnitski.Library.Action.Comparator;

import by.it.trudnitski.Library.Entity.AbstractBook;
import by.it.trudnitski.Library.Entity.Book;

import java.util.Comparator;

public class ComparatorByAuthor implements Comparator <Book> {
    @Override
    public int compare(Book o1, Book o2) {
        if (o1 != null & o2 != null){
            return o1.getAuthor().compareToIgnoreCase(o2.getAuthor());
        }
        return -1;
    }
}
