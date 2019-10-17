package by.it.trudnitski.Library.Entity;

public class Magazine extends Library {
    private int monthNumber;


    public Magazine(int id, String title, int year, int pages, String genre, int monthNumber) {
        super(id, title, pages, genre, year);
        this.monthNumber = monthNumber;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    @Override
    public String toString() {
        return " Magazine  id - " + getId() + " ,title - " + getTitle()
                + ", pages -  " + getPages() + ", genre - " + getGenre()
                + ", month - " + getMonthNumber();
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
        if (obj == null && this.getClass() != obj.getClass()) {
            return false;
        }
        Magazine magazine = (Magazine) obj;
        return getPages() == magazine.getPages() && getId() == magazine.getId()
                && getYear() == magazine.getYear()
                && getTitle().equals(magazine.getTitle())
                && getGenre().equals(magazine.getGenre())
                && getMonthNumber() == magazine.getMonthNumber();
    }
}
