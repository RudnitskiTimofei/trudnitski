package by.it.trudnitski.Library.Entity;

public class Book extends AbstractBook {
    private String author;
    private int year;


    public Book(int id, String title, String author, int year, int pages, String genre) {
        super(id, title, pages, genre);
        this.author = author;
        this.year = year;

    }


    private String getAuthor() {
        return author;
    }

    private int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return " Book id - " + getId() + " ,author" + getAuthor() + ", title - " + getTitle() + ", pages -  " + getPages() + ", genre - " + getGenre() + ", year - " + getYear();
    }
}
