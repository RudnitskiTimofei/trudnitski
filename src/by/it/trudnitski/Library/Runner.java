package by.it.trudnitski.Library;

import by.it.trudnitski.Library.Action.Comparator.ComparatorByGenre;
import by.it.trudnitski.Library.Action.Sort;
import by.it.trudnitski.Library.InOut.Input;
import by.it.trudnitski.Library.InOut.Path;
import by.it.trudnitski.Library.InOut.Printer;

import static by.it.trudnitski.Library.InOut.Input.books;


public class Runner {

    public static void main(String[] args) {
        Input.readFile(Path.getPath(Input.class, "List.csv"));
        Printer.printListOfBooks(books);
        System.out.println(Sort.findAllPagesCountByGenre(books,"Imagine Literature"));
        Printer.printListOfBooks(Sort.sortByTitles(books));
        System.out.println();
        Printer.printListOfBooks(Sort.sortByPages(books));
        System.out.println();
        Printer.printListOfBooks(Sort.sortByGenreAndPages(books));
        System.out.println();
        Printer.printListOfBooks(Sort.findOneBookFromList(books,"Tree mushketir","Imagine Literature"));
        Sort.sortByComparator(new ComparatorByGenre());



    }
}
