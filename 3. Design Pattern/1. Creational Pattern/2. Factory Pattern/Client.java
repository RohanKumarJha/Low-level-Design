public class Client {
    public static void main(String[] args) {
        FactoryPattern pattern1 = new FactoryPattern();
        pattern1.getShape("SQUARE").draw();

        FactoryPattern pattern2 = new FactoryPattern();
        pattern2.getShape("RECTANGLE").draw();

        FactoryPattern pattern3 = new FactoryPattern();
        pattern3.getShape("CIRCLE").draw();

        
    }
}
