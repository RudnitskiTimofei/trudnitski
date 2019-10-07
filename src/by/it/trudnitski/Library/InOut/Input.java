package by.it.trudnitski.Library.InOut;

import by.it.trudnitski.Library.Entity.Book;
import by.it.trudnitski.Library.Entity.Magazine;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Input {
    public static ArrayList books = new ArrayList();

    public static ArrayList readFile(String filename) {
        try(BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String text;
            String title;
            String author;
            String genre;
            int year;
            int pages;
            int month;

            while ((text = reader.readLine()) != null) {

                String[] lines = text.split(";");
                title = lines[0].trim();
                author = lines[1].trim();
                year = Integer.parseInt(lines[2].trim());
                pages = Integer.parseInt(lines[3].trim());
                genre = lines[4].trim();
                month = Integer.parseInt(lines[5].trim());
                if (month == 0) {

                    books.add(new Book(title, author, year, pages, genre));
                } else {
                    books.add(new Magazine(title,year, pages, genre, month));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(" File is not here! ");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return books;
    }

}
