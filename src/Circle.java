public class Circle {
    double radius;

    public Circle(double r) {
        radius = r;
    }

    public double circleArea() {
        double cirArea = Math.PI * Math.pow(radius,2);
        return cirArea;
    }

}
