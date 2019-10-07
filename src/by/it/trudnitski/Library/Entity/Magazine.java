package by.it.trudnitski.Library.Entity;

import by.it.trudnitski.Library.Entity.AbstractBook;

public class Magazine extends AbstractBook {
    private int monthNumber;
    private int year;

    public Magazine(String title, int year, int pages, String genre, int monthNumber) {
        super(title, pages, genre);
        this.monthNumber=monthNumber;
        this.year=year;

    }

    public int getMonthNumber() {
        return monthNumber;
    }

    @Override
    public String toString() {
        return " Magazine  title - " + getTitle() + ", pages -  " + getPages() + ", genre - " + getGenre() + ", month - " + getMonthNumber();
    }
}
