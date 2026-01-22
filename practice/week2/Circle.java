public class Circle {
    double radius;
    public static final double PI = 3.14159;

    public Circle() {
        radius = 0;
    }

    public Circle (double r) {
        radius = r;
    }

    public double getArea() {
        return PI * radius * radius;
    }
}