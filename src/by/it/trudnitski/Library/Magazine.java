package by.it.trudnitski.Library;

public class Magazine extends AbstractBook {
    private int monthNumber;

    public Magazine(String title, int pages, String genre, int monthNumber) {
        super(title, pages, genre);
        this.monthNumber=monthNumber;

    }

    public int getMonthNumber() {
        return monthNumber;
    }

    @Override
    public String toString() {
        return " Magazine [ title = " + getTitle() + ", pages =  " + getPages() + ", genre " + getGenre() + " month " + getMonthNumber() + "]";
    }
}
