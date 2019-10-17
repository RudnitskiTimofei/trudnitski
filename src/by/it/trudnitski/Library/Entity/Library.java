package by.it.trudnitski.Library.Entity;

public abstract class Library {

    private String title;
    private int pages;
    private String genre;
    private int id;
    private int year;

    public Library(int id, String title, int pages, String genre, int year) {
        this.id = id;
        this.title = title;
        this.pages = pages;
        this.genre = genre;
        this.year = year;
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

    public int getYear() {
        return year;
    }


    @Override
    public int hashCode() {
        final int pr = 31;
        int result = 1;
        result = pr * result + getId();
        result = pr * result + getPages();
        result = pr * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null) && (this.getClass() != obj.getClass())) {
            return false;
        }
        Book book = (Book) obj;
        return getPages() == book.getPages() && getId() == book.getId()
                && getYear() == book.getYear()
                && getTitle().equals(book.getTitle())
                && getGenre().equals(book.getGenre());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
