package Factory;

public class Bike implements Vehicle {

    @Override
    public void maxSpeed() {
        System.out.println("The maximum speed of bike is 140Km");
    }

    @Override
    public void fuelType() {
        System.out.println("The fueltype of bike is petrol");
    }
    
}
