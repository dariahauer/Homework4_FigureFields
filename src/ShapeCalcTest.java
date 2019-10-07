public class ShapeCalcTest {

    public static void main(String[] args) {
        ShapeCalculator shapeCalculator=new ShapeCalculator();
        Square square=new Square(5);
        Rectangle rectangle=new Rectangle(2,4);
        Circle circle = new Circle(2);
        Triangle triangle=new Triangle(5,8,11);

        shapeCalculator.squareArea(square);
        System.out.println("Square area = " + shapeCalculator.squareArea(square));

        shapeCalculator.circleArea(circle);
        System.out.println("Circle area = " + shapeCalculator.circleArea(circle));

        shapeCalculator.trianglePerimeter(triangle);
        System.out.println("Triangle perimeter = " + shapeCalculator.trianglePerimeter(triangle));

        shapeCalculator.rectPerimeter(rectangle);
        System.out.println("Rectangle perimeter = " + shapeCalculator.rectPerimeter(rectangle));


    }
}
