package by.it.trudnitski.Library;

import by.it.trudnitski.Library.Action.Sort;
import by.it.trudnitski.Library.InOut.Input;
import by.it.trudnitski.Library.InOut.Path;
import by.it.trudnitski.Library.InOut.Printer;

import java.util.ArrayList;

import static by.it.trudnitski.Library.InOut.Input.books;


public class Runner {

    public static void main(String[] args) {

        Input.readFile(Path.getPath(Input.class, "List.csv"));
        Printer.printListOfBooks(books);
        System.out.println(Sort.findAllPagesCountByGenre(books,"Imagine Literature"));
        Printer.printListOfBooks((ArrayList) Sort.sortByTitles(books));
        System.out.println();
        Printer.printListOfBooks((ArrayList)Sort.sortByPages(books));
        System.out.println();
        Printer.printListOfBooks((ArrayList) Sort.sortByTitlesAndGenre(books));
        System.out.println();
        Printer.printListOfBooks((ArrayList) Sort.findOneBookFromList(books,"Tree mushketir","Imagine Literature"));


    }
}
