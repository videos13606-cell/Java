package zad6;

public class Apartament extends Property implements Rentable{
    private int floor;

    public Apartament(String address, double area, int floor) {
        super(address, area);
        this.floor = floor;
    }

    @Override
    public double calculateTax(double taxRate) {
        return area * taxRate;
    }

    @Override
    public void rentOut() {
        this.isRented = true;
    }

    @Override
    public void freeUp() {
        this.isRented = false;
    }

    @Override
    public boolean isRented() {
        return this.isRented;
    }
}
