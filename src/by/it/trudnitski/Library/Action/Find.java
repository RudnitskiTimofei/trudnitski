package by.it.trudnitski.Library.Action;

import by.it.trudnitski.Library.Entity.Library;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.stream.Collectors;

public class Find {
    private static final Logger LOGGER = LogManager.getLogger(Find.class);

    public static int findAllPagesCountByGenre(List<Library> book, String genre) {
        LOGGER.info(" Find all pages by genre");
        return book.stream().filter((o) -> o.getGenre().equals(genre)).mapToInt(Library::getPages).sum();

    }

    public static List findOneBookFromList(List<Library> book, String title, String genre) {

        List<Library> collect = book.stream().filter(o -> o.getGenre().equals(genre)).
                collect(Collectors.toList());
        List<Library> result = collect.stream().filter(o -> o.getTitle().startsWith(title)).collect(Collectors.toList());

        return result;
    }

}
