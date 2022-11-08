package School;

import java.util.Scanner;

public class AreaOfShapes {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Shapes Supported: Square, Rectangle, Trapezoid.");
        System.out.println();
        System.out.print("Enter Name of Shape to Calculate Area: ");
        String shape = s.nextLine();

        if(shape.equalsIgnoreCase("square")){

            System.out.println("Calculate Area of Square");

            System.out.print("Enter Side: ");
            double side = s.nextDouble();
            double area = side * side;

            System.out.println();
            System.out.println("Area of Square: "+area );

        }else if(shape.equalsIgnoreCase("rectangle")){

            System.out.println("Calculate Area of Rectangle");

            System.out.print("Enter Length: ");
            double length = s.nextDouble();

            System.out.print("Enter Width: ");
            double width = s.nextDouble();

            double area = length * width;

            System.out.println();
            System.out.println("Area of Rectangle: "+area);

        }else if(shape.equalsIgnoreCase("trapezoid")){

            System.out.println("Calculate Area of Trapezoid");

            System.out.print("Enter Base1: ");
            double base1 = s.nextDouble();

            System.out.print("Enter Base2: ");
            double base2 = s.nextDouble();

            System.out.print("Enter Height: ");
            double height = s.nextDouble();

            double area = ((base1 + base2)/2) * height;

            System.out.println();
            System.out.println("Area of Trapezoid: "+area);

        }else{
            System.out.println("Shape Not Supported");
        }

    }

}
