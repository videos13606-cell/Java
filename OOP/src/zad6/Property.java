package zad6;

public abstract class Property {
    protected String address;
    protected double area;
    protected boolean isRented;

    public Property(String address, double area) {
        this.address = address;
        this.area = area;
        this.isRented = false; // Задава се твърдо тук
    }

    public abstract double calculateTax(double taxRate);
}