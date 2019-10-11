package by.it.trudnitski.Library.InOut;

import by.it.trudnitski.Library.Entity.AbstractBook;
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
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String text;
            String title;
            String author;
            String genre;
            int year;
            int pages;
            int month;
            int id;

            while ((text = reader.readLine()) != null) {

                String[] lines = text.split(";");
                id = Integer.parseInt(lines[0].trim());
                title = lines[1].trim();
                author = lines[2].trim();
                year = Integer.parseInt(lines[3].trim());
                pages = Integer.parseInt(lines[4].trim());
                genre = lines[5].trim();
                month = Integer.parseInt(lines[6].trim());

                if (month == 0) {
                    books.add(new Book(id, title, author, year, pages, genre));
                } else {
                    books.add(new Magazine(id, title, year, pages, genre, month));
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
