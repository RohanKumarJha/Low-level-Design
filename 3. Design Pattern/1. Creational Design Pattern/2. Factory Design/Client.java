import Factory.CreateFactoryObject;
import Shape.Circle;
import Shape.Rectangle;
import Shape.Square;

public class Client {
    public static void main(String[] args) {
        Circle circle = (Circle) CreateFactoryObject.draw("Circle");
        circle.area(12.0);

        Rectangle rectangle = (Rectangle) CreateFactoryObject.draw("rectangle");
        rectangle.area(12, 10);

        Square square = (Square) CreateFactoryObject.draw("Square");
        square.area(12);
    }
}
