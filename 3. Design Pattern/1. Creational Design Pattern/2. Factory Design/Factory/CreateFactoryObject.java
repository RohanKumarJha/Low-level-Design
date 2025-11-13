package Factory;

import Shape.Circle;
import Shape.Rectangle;
import Shape.Shape;
import Shape.Square;

public class CreateFactoryObject {

    public static Shape draw(String string) {
        if (string.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if(string.equalsIgnoreCase("square")) {
            return new Square();
        } else if(string.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else return null;
    }
}
