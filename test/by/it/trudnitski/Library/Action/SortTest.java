package by.it.trudnitski.Library.Action;

import by.it.trudnitski.Library.Entity.Book;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SortTest {
    private List testing = new ArrayList();

    @Before
    public void createList(){
        testing.add(new Book(8971,"Third expedition",
                "Bredberyy",1934,256,"Imagine Literature"));
        testing.add(new Book(9702,"Tree mushketir",
                "Dumous",1815,793,"Imagine Literature"));
        testing.add(new Book(3838,"Wild Weather",
                "Engels",1873,1129,"Science Literature"));
        testing.add(new Book(7719,"Mystery of Russian gigant",
                "Galkina",2002,432,"Science Literature"));
    }

    @Test
    public void findAllPagesCountByGenre() {
        int res = Sort.findAllPagesCountByGenre(testing,"Imagine Literature");
        Assert.assertEquals(1049,res);
    }

    @Test
    public void sortByTitles() {
        Assert.assertEquals(testing.get(3), Sort.sortByTitles(testing).get(0));

    }

    @Test
    public void sortByPages() {
        Assert.assertEquals(testing.get(0),Sort.sortByPages(testing).get(0));
    }

    @Test
    public void sortByGenreAndPages() {
        Assert.assertEquals(testing.get(0), Sort.sortByGenreAndPages(testing).get(0));
    }

    @Test
    public void findOneBookFromList() {
        Assert.assertEquals(testing.get(2),
                Sort.findOneBookFromList(testing,"Wild Weather","Science Literature").get(0));
    }
}