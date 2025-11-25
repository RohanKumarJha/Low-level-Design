package Factory;

public class Car implements Vehicle {

    @Override
    public void maxSpeed() {
        System.out.println("The maximum speed of car is 180Km");
    }

    @Override
    public void fuelType() {
        System.out.println("The fueltype of car is (petrol/diesel)");
    }
}
