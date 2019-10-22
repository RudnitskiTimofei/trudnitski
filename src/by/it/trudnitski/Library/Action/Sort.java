package by.it.trudnitski.Library.Action;

import by.it.trudnitski.Library.Action.Comparator.ComparatorByGenre;
import by.it.trudnitski.Library.Action.Comparator.ComparatorByTitle;
import by.it.trudnitski.Library.Entity.Library;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {

    private static final Logger LOGGER = LogManager.getLogger(Sort.class);

    public static List<Library> sortByTitles(List<Library> book) {
        LOGGER.info("sorting by titile");
        Comparator comparator = new ComparatorByTitle();
        book.sort(comparator);
        return book;
    }

    public static List<Library> sortByGenre(List<Library> book){
        LOGGER.info("Sorting by genre");
        Comparator comparator = new ComparatorByGenre();
        book.sort(comparator);
        return book;
    }

    public static List<Library> sortByPages(List<Library> book) {
        LOGGER.info("Sorting by pages");
        return book.stream().sorted(Comparator.comparing(Library::getPages)).collect(Collectors.toList());
    }

    public static List<Library> sortByGenreAndPages(List<Library> books) {
        LOGGER.info("Sorting by genre and pages");
        return books.stream().sorted(Comparator.comparing(Library::getGenre)
                .thenComparing(Library::getPages)).collect(Collectors.toList());
    }



}
