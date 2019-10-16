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
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        if (this.getId() == book.getId()) {
            return true;
        }
        if (this.getAuthor() == book.getAuthor()) {
            return true;
        }
        if (this.getYear() == book.getYear()) {
            return true;
        }
        return false;
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
