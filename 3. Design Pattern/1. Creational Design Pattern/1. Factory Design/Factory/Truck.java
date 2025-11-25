package Factory;

public class Truck implements Vehicle {

    @Override
    public void maxSpeed() {
        System.out.println("The maximum speed of truck is 120Km");
    }

    @Override
    public void fuelType() {
        System.out.println("The fueltype of truck is diesel");
    }
    
}
