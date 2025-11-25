import Factory.Vehicle;
import Factory.VehicleFactory;

public class Client {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        
        Vehicle vehicle1 = vehicleFactory.creatVehicle("car");
        Vehicle vehicle2 = vehicleFactory.creatVehicle("truck");
        Vehicle vehicle3 = vehicleFactory.creatVehicle("bike");
        // Vehicle vehicle4 = vehicleFactory.creatVehicle("");
        vehicle1.maxSpeed();
        vehicle1.fuelType();
        vehicle2.maxSpeed();
        vehicle2.fuelType();
        vehicle3.maxSpeed();
        vehicle3.fuelType();
    }
}