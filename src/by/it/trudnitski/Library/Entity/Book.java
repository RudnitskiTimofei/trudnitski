package by.it.trudnitski.Library.Entity;

public class Book extends AbstractBook {
    private String author;
    private int year;


    public Book(String title, String author, int year, int pages, String genre ){
        super(title, pages, genre);
        this.author=author;
        this.year = year;

    }


    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return " Book author - " + getAuthor() + ", title - " + getTitle() + ", pages -  " + getPages() + ", genre - " + getGenre() +  ", year - " + getYear();
    }
}
