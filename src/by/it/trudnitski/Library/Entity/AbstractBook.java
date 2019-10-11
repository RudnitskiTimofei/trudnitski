package by.it.trudnitski.Library.Entity;

public class AbstractBook {

    private String title;
    private int pages;
    private String genre;
    private int id;

    public AbstractBook(int id, String title, int pages, String genre) {
        this.id = id;
        this.title = title;
        this.pages = pages;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public String getGenre() {
        return genre;
    }

    public int getId() {
        return id;
    }
}
