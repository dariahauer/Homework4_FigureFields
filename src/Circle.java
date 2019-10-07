public class Circle {
    double radius;

    public Circle(double r) {
        radius = r;
    }

    public double circleArea() {
        double cirArea = 3.14 * radius * radius;
        return cirArea;
    }

}
