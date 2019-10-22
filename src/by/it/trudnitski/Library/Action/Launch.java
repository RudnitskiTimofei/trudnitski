package by.it.trudnitski.Library.Action;

import by.it.trudnitski.Library.InOut.Printer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

import static by.it.trudnitski.Library.InOut.Input.books;

public class Launch {
    private static final Logger LOGGER = LogManager.getLogger(Launch.class);
    Scanner sc = new Scanner(System.in);

    public void findAllPages() {
        System.out.println(" You can find all pages by one genre\n" +
                "Choose the genre:\n" +
                " '1' - Imagine Literature\n" +
                " '2' - Science Literature\n" +
                " '3' - Art\n" +
                " '4' - Fashion\n" +
                " '5' - Science ");
        try {
            int chooise = sc.nextInt();
            switch (chooise) {
                case 1:
                    System.out.println(Find.findAllPagesCountByGenre(books, "Imagine Literature"));
                    break;
                case 2:
                    System.out.println(Find.findAllPagesCountByGenre(books, "Science Literature"));
                    break;
                case 3:
                    System.out.println(Find.findAllPagesCountByGenre(books, "Art"));
                    break;
                case 4:
                    System.out.println(Find.findAllPagesCountByGenre(books, "Fashion"));
                    break;
                case 5:
                    System.out.println(Find.findAllPagesCountByGenre(books, "Sciense"));
                    break;
                default:
                    System.out.println("Please, next time enter number up 1 to 5, thank you");
                    LOGGER.error(" User choose are wrong number");
                    break;
            }
            System.out.println();
        } catch (Exception e) {
            LOGGER.error(e);
            e.printStackTrace();
        }


    }

    public void sorting() {
        System.out.println(" You can choose how you want sort our Library\n" +
                "Please chose one\n" +
                " '1' - Sorting by title\n" +
                " '2' - Sorting by pages\n" +
                " '3' - Sorting by genre\n" +
                " '4' - Sorting by genre and pages");
        try {
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    Printer.printListOfBooks(Sort.sortByTitles(books));
                    break;
                case 2:
                    Printer.printListOfBooks(Sort.sortByPages(books));
                    break;
                case 3:
                    Printer.printListOfBooks(Sort.sortByGenre(books));
                    break;
                case 4:
                    Printer.printListOfBooks(Sort.sortByGenreAndPages(books));
                    break;
                default:
                    System.out.println("  Please, next time, enter the numbers up 1 to 3, thank you");
                    LOGGER.error(" User choose are wrong number");
                    break;
            }
            System.out.println();

        } catch (Exception e) {
            LOGGER.error(e);
            e.printStackTrace();
        }

    }

    public void findOneBook() {
        System.out.println(" You can find one book from our Library\n");
        try {
            System.out.println(" Choose the genre:\n" +
                    " '1' - Imagine Literature\n" +
                    "' 2' - Science Literature\n" +
                    " '3' - Art\n" +
                    " '4' - Fashion\n" +
                    " '5' - Science\n");
            int choose = sc.nextInt();
            System.out.println(" Enter first literal of the book: ");
            String name = sc.next().toUpperCase();

            if (choose > 0 && !(name.isEmpty())) {
                switch (choose) {
                    case 1:
                        Printer.printListOfBooks(Find.findOneBookFromList(books,name,"Imagine Literature"));
                        break;
                    case 2:
                        Printer.printListOfBooks(Find.findOneBookFromList(books,name,"Science Literature"));
                        break;
                    case 3:
                        Printer.printListOfBooks(Find.findOneBookFromList(books,name,"Art"));
                        break;
                    case 4:
                        Printer.printListOfBooks(Find.findOneBookFromList(books,name,"Fashion"));
                        break;
                    case 5:
                        Printer.printListOfBooks(Find.findOneBookFromList(books,name,"Sciense"));
                    default:
                        System.out.println("  Please, next time, enter the numbers up 1 to 5, thank you");
                        LOGGER.error(" User choose are wrong number");
                        break;
                }
            } else {
                LOGGER.error("Wrong numbers or empty string");
                System.out.println(" Please enter positive numbers and one literal");
            }

        } catch (Exception e) {
            LOGGER.error(e);
            e.printStackTrace();
        }
    }
}
