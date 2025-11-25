package Factory;

public class VehicleFactory {
    public Vehicle creatVehicle(String vehicleName) {
        switch (vehicleName) {
            case "bike":
                return new Bike();
            
            case "car":
                return new Car();

            case "truck":
                return new Truck();
        
            default:
                return null;
        }
    }
}
