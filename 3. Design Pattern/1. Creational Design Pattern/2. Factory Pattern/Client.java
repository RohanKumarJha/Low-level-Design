import Shape.Shape;

public class Client {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.createShape("rectangle");
        shape.shape();
    }
}
