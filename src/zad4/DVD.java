package zad4;

public class DVD extends LibraryItem implements Borrowable {
    private int duration;

    public DVD(String title, int year,boolean available, int duration)
    {
        super(title, year,available);
        this.duration = duration;
    }

    @Override
    public double calculateLateFee(int daysLate)
    {
        return daysLate;
    }

    @Override
    public void borrowItem() {
        if (this.available == true)
        {
            this.available = false;
        }
        else
        {
            System.out.println("DVD has already been borrowed");
        }
    }

    @Override
    public void returnItem() {
        if (this.available == true)
        {
            System.out.println("DVD has already been returned");
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

