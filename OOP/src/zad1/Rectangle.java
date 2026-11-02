package zad1;

public class Rectangle extends Shape
{
    private double width;
    private double height;
    public Rectangle(String color, double width, double height)
    {
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter()
    {
        return 2*(width + height);
    }

    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println("Figure: Rectangle");
        System.out.println("Color: "+ color);
        System.out.println("Width: "+ width);
        System.out.println("Height: "+ height);
        System.out.println("-----------------------");
    }

}
