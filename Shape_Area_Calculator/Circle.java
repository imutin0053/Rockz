public class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double CalculateArea() {
        return Math.PI * radius * radius;
    }
}
