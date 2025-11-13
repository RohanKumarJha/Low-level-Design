package Shape;

public class Rectangle implements Shape{

    @Override
    public void draw() {}

    public void area(int length,int breadth) {
        System.out.println("The area of rectangle is "+(length*breadth));
    }
}
