public class MotorCycle implements Vehicle {

    @Override
    public void travel(String source, String destination) {
        System.out.println("The distance between "+source+" and "+destination+" is 100km");
        System.out.println("It takes 2hrs to travel by motorcycle");
    }

}