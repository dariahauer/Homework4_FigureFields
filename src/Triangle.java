public class Triangle {
    double sideA;
    double sideB;
    double sideC;

    public Triangle(double a, double b, double c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    public double trianglePerimeter() {
        double trPer = sideA + sideB + sideC;
        return trPer;
    }
}
