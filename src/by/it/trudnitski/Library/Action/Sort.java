package by.it.trudnitski.Library.Action;

import by.it.trudnitski.Library.Entity.AbstractBook;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {

    public static int findAllPagesCountByGenre(ArrayList<AbstractBook> arrayList, String genre) {

        return arrayList.stream().filter((o) -> o.getGenre().equals(genre)).mapToInt(AbstractBook::getPages).sum();

    }

    public static List<AbstractBook> sortByTitles(ArrayList<AbstractBook> arrayList) {
        return arrayList.stream().sorted(((o1, o2) -> o1.getTitle().compareToIgnoreCase(o2.getTitle()))).collect(Collectors.toList());

    }

    public static List<AbstractBook> sortByPages(ArrayList<AbstractBook> arrayList) {
        return arrayList.stream().sorted(Comparator.comparing(AbstractBook::getPages)).collect(Collectors.toList());
    }

    public static List<AbstractBook> sortByTitlesAndGenre(ArrayList<AbstractBook> arrayList) {
        return arrayList.stream().sorted(Comparator.comparing(AbstractBook::getTitle).thenComparing(AbstractBook::getGenre)).collect(Collectors.toList());
    }

    public static List findOneBookFromList(ArrayList<AbstractBook> arrayList, String title, String genre) {
        List<AbstractBook> collect = arrayList.stream().filter(o -> o.getGenre().equals(genre)).collect(Collectors.toList());
        return collect.stream().filter(o -> o.getTitle().equals(title)).collect(Collectors.toList());
    }

}
