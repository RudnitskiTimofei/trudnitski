package by.it.trudnitski.Library.Entity;

public class Magazine extends AbstractBook {
    private int monthNumber;
    private int year;

    public Magazine(int id, String title, int year, int pages, String genre, int monthNumber) {
        super(id, title, pages, genre);
        this.monthNumber = monthNumber;
        this.year = year;

    }

    public int getMonthNumber() {
        return monthNumber;
    }

    @Override
    public String toString() {
        return " Magazine  id - " + getId() + " ,title" + getTitle() + ", pages -  " + getPages() + ", genre - " + getGenre() + ", month - " + getMonthNumber();
    }
}
