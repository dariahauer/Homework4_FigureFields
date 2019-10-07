public class ShapeCalculator {

    public double squareArea(Square square) {
        double sqArea = square.side * square.side;
        return sqArea;
    }

    public double circleArea(Circle cirle) {
        double cirArea = 3.14 * cirle.radius * cirle.radius;
        return cirArea;
    }

    public double trianglePerimeter(Triangle triangle) {
        double trPer = triangle.sideA + triangle.sideB + triangle.sideC;
        return trPer;
    }

    public double rectPerimeter(Rectangle rectangle) {
        double recPer = 2 * (rectangle.sideA + rectangle.sideB);
        return recPer;
    }

}
