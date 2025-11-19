import Shape.Circle;
import Shape.Rectangle;
import Shape.Shape;
import Shape.Square;

public class ShapeFactory {

    public Shape createShape(String shape) {
        switch (shape) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            case "rectangle":
                return new Rectangle();
        
            default:
                System.out.println("Invalid choice!!!!!");
                return null;
        }
    }
}