package Shape;

public class Square implements Shape {

    @Override
    public void draw() {}

    public void area(int side) {
        System.out.println("The area of square is "+(side*side));
    }
}
