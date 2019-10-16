package by.it.trudnitski.Library.InOut;

import by.it.trudnitski.Library.Entity.Book;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class InputTest {
    private List testing = new ArrayList();

    @Before
    public void createList() {
        testing.add(new Book(8971, "Third expedition",
                "Bredberyy", 1934, 256, "Imagine Literature"));
        testing.add(new Book(9702, "Tree mushketir",
                "Dumous", 1815, 793, "Imagine Literature"));
        testing.add(new Book(3838, "Wild Weather",
                "Engels", 1873, 1129, "Science Literature"));
        testing.add(new Book(7719, "Mystery of Russian gigant",
                "Galkina", 2002, 432, "Science Literature"));
    }

    @Test
    public void readFile() {
        Assert.assertEquals(testing.get(3), Input.readFile(Path.getPath(Input.class, "List.csv")).get(24));

    }

}