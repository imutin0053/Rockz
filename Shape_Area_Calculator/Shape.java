import java.util.Scanner;

public abstract class Shape {
    abstract double CalculateArea();

    public static void main(String[] args) {
        Shape s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Radius Of Circle: ");
        double r = sc.nextDouble();
        s = new Circle(r);
        System.out.printf("Area of Circle: %.2f\n", s.CalculateArea());
        System.out.print("Enter The Length Of Rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter The Width Of Rectangle: ");
        double w = sc.nextDouble();
        s = new Rectangle(l, w);
        System.out.printf("Area of Rectangle: %.2f\n", s.CalculateArea());
        System.out.print("Enter The Base Of Triangle: ");
        double b = sc.nextDouble();
        System.out.print("Enter The Height Of Triangle: ");
        double h = sc.nextDouble();
        s = new Triangle(b, h);
        System.out.printf("Area of Triangle: %.2f\n", s.CalculateArea());
    }
}
