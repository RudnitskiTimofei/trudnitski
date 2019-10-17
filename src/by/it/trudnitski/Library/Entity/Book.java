package by.it.trudnitski.Library.Entity;

public class Book extends Library {
    private String author;


    public Book(int id, String title, String author, int year, int pages, String genre) {
        super(id, title, pages, genre, year);
        this.author = author;

    }

    private String getAuthor() {
        return author;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null && this.getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return getPages() == book.getPages() && getId() == book.getId()
                && getYear() == book.getYear()
                && getTitle().equals(book.getTitle())
                && getGenre().equals(book.getGenre())
                && getAuthor().equals(book.getAuthor());
    }

    @Override
    public int hashCode() {
        final int pr = 31;
        int result = 1;
        result = pr * result + getId();
        result = pr * result + getYear();
        result = pr * result + (getAuthor() == null ? 0 : getAuthor().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return " Book id - " + getId() + " ,author - " + getAuthor()
                + ", title - " + getTitle() + ", pages -  " + getPages()
                + ", genre - " + getGenre() + ", year - " + getYear();
    }
}
