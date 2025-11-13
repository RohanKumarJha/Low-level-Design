package Shape;

public class Circle implements Shape {

    @Override
    public void draw() {}

    public void area(double radius) {
        System.out.println("The area of circle is "+(radius*radius));
    }

}
