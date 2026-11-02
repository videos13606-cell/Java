package zad4;

public class Book extends LibraryItem implements Borrowable {
    private String author;

    public Book(String title, int year, boolean available, String author)
    {
        super(title, year,available);
        this.author = author;
    }

    @Override
    public double calculateLateFee(int daysLate)
    {
        return daysLate*0.5;
    }

    @Override
    public void borrowItem() {
        if (this.available == true)
        {
            this.available = false;
        }
        else
        {
            System.out.println("Book has already been borrowed");
        }
    }

    @Override
    public void returnItem() {
        if (this.available == true)
        {
            System.out.println("Book has already been returned");
        }
        else
        {
            this.available = true;
        }

    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}
