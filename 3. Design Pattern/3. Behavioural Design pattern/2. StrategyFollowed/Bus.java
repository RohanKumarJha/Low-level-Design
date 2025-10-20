public class Bus implements Vehicle {

    @Override
    public void travel(String source, String destination) {
        System.out.println("The distance between "+source+" and "+destination+" is 100km");
        System.out.println("It takes 2.5hrs to travel by bus");
    }
    
}
