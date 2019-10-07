public class Rectangle {
    double sideA;
    double sideB;

    public Rectangle(double a, double b) {
        sideA = a;
        sideB = b;
    }

    public double rectPerimeter() {
        double recPer = 2 * (sideA + sideB);
        return recPer;
    }
}
