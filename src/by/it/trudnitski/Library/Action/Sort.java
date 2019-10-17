package by.it.trudnitski.Library.Action;

import by.it.trudnitski.Library.Action.Comparator.ComparatorByTitle;
import by.it.trudnitski.Library.Entity.Library;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {

    public static int findAllPagesCountByGenre(List<Library> book, String genre) {

        return book.stream().filter((o) -> o.getGenre().equals(genre)).mapToInt(Library::getPages).sum();

    }

    public static List<Library> sortByTitles(List<Library> book) {
        Comparator comparator = new ComparatorByTitle();
        book.sort(comparator);
        return book;
    }

    public static List<Library> sortByPages(List<Library> book) {
        return book.stream().sorted(Comparator.comparing(Library::getPages)).collect(Collectors.toList());
    }

    public static List<Library> sortByGenreAndPages(List<Library> books) {
        return books.stream().sorted(Comparator.comparing(Library::getGenre)
                .thenComparing(Library::getPages)).collect(Collectors.toList());
    }

    public static List findOneBookFromList(List<Library> book, String title, String genre) {
        List<Library> collect = book.stream().filter(o -> o.getGenre().equals(genre)).
                collect(Collectors.toList());
        return collect.stream().filter(o -> o.getTitle().equals(title)).collect(Collectors.toList());
    }

}
