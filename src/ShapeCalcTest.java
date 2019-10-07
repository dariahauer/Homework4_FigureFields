public class ShapeCalcTest {

    public static void main(String[] args) {
        Square square = new Square(5);
        double sqArea = square.squareArea();
        Rectangle rect = new Rectangle(2, 4);
        double rectPer = rect.rectPerimeter();
        Circle circle = new Circle(2);
        double crAr = circle.circleArea();
        Triangle triangle = new Triangle(5, 8, 11);
        double trPer = triangle.trianglePerimeter();

        System.out.println("Square area = " + sqArea);

        System.out.println("Circle area = " + crAr);

        System.out.println("Triangle perimeter = " + trPer);

        System.out.println("Rectangle perimeter = " + rectPer);

    }
}
