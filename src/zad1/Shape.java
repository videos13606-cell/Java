package zad1;

public abstract class Shape {
    protected String color;
    public Shape(String color)
    {
       this.color = color;
    }
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public void printInfo()
    {
        System.out.println("----INFO FOR FIGURE----");
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
