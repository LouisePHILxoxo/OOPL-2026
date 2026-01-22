package practice.week2;
public class MainCircle {
    public static void main(String[] args) {

        Circle myCircle = new Circle(250);
        double area = myCircle.getArea();
        System.out.printf("Area of the circle with radius 250 is: %.2f\n", area);

    }
}
