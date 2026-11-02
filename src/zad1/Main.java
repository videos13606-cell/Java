package zad1;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Shape[] shapes = new Shape[5];
        int count =0;
        for(Shape s:shapes)
        {
            if(count<2)
            {
                System.out.println("TYPE SHAPE: CIRCLE");
                System.out.println("Enter color:");
                String color_circle = scanner.nextLine();
                System.out.println("Enter radius:");
                double radius_circle = scanner.nextDouble();
                scanner.nextLine();
                shapes[count] = new Circle(color_circle,radius_circle);
            }
            else if(count>=2)
            {
                System.out.println("TYPE SHAPE: RECTANGLE");
                System.out.println("Enter color:");
                String color_rectangle = scanner.nextLine();
                System.out.println("Enter height: ");
                double height_rectangle = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Enter width: ");
                double width_rectangle = scanner.nextDouble();
                scanner.nextLine();
                shapes[count] =  new Rectangle(color_rectangle,width_rectangle,height_rectangle);
            }
            count++;
        }

        scanner.close();
        for (Shape s:shapes)
        {
            s.printInfo();
        }

        double maxArea = shapes[0].calculateArea();
        int figureWithMaxArea = 0;
        for(Shape s:shapes)
        {
            if(maxArea<s.calculateArea())
            {
                maxArea = s.calculateArea();
                figureWithMaxArea++;
            }

        }
        String figureWithMaxArea_Type = "";
        if(figureWithMaxArea>=2)
        {
            figureWithMaxArea_Type = "rectangle";
        }
        else
        {
            figureWithMaxArea_Type = "circle";
        }
        System.out.println("");
        System.out.printf("The figure with the maximum area (%.2f) is figure number %d, that is a %s. ",maxArea,figureWithMaxArea,figureWithMaxArea_Type);




    }
}
