package zad4;

public abstract class LibraryItem {
    protected String title;
    protected int year;
    protected boolean available;

    public LibraryItem(String title, int year, boolean available) {
        this.title = title;
        this.year = year;
        this.available = true;
    }
    public abstract double calculateLateFee(int daysLate);
}
