package by.it.trudnitski.Library.Action.Comparator;

import by.it.trudnitski.Library.Entity.Library;

import java.util.Comparator;

public class ComparatorByGenre implements Comparator<Library> {
    @Override
    public int compare(Library o1, Library o2) {

        return o1.getGenre().compareTo(o2.getGenre());
    }


}
