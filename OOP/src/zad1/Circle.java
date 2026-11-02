package zad1;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter()
    {
        return Math.PI * radius *2;
    }

    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println("Figure: circle");
        System.out.println("Color: "+ color);
        System.out.println("Radius: "+ radius);
        System.out.println("-----------------------");
    }


}
