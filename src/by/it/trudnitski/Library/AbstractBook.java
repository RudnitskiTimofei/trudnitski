package by.it.trudnitski.Library;

public class AbstractBook {

    private String title;
    private int pages;
    private String genre;

    public AbstractBook(String title, int pages, String genre) {
        this.title = title;
        this.pages = pages;
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
}
