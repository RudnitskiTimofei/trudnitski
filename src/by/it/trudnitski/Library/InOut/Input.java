package by.it.trudnitski.Library.InOut;

import by.it.trudnitski.Library.Entity.Book;
import by.it.trudnitski.Library.Entity.Library;
import by.it.trudnitski.Library.Entity.Magazine;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Input {
    public static ArrayList<Library> books;

    public static List readFile(String filename) {
        books = new ArrayList();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String text;
            String title = null;
            String author = null;
            String genre = null;
            int year = 0;
            int pages = 0;
            int month = 0;
            int id = 0;

            while ((text = reader.readLine()) != null) {

                String[] lines = text.split(";");
                try{
                    id = Integer.parseInt(lines[0].trim());
                    try{

                        title = lines[1].trim();
                        try{
                            author = lines[2].trim();
                            try{
                                year = Integer.parseInt(lines[3].trim());
                                try{
                                    pages = Integer.parseInt(lines[4].trim());
                                    try{
                                        genre = lines[5].trim();
                                        try{
                                            month = Integer.parseInt(lines[6].trim());

                                        } catch (NumberFormatException e) {
                                            e.printStackTrace();
                                        }

                                    } catch (NumberFormatException e) {
                                        e.printStackTrace();
                                    }

                                } catch (NumberFormatException e) {
                                    e.printStackTrace();
                                }

                            } catch (NumberFormatException e) {
                                e.printStackTrace();
                            }

                        } catch (NumberFormatException e) {
                            e.printStackTrace();
                        }
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }


                if (genre.contains("Literature")) {
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
