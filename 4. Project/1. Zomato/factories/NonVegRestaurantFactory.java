package factories;
import model.*;

public class NonVegRestaurantFactory implements IRestaurantFactory {
    @Override
    public Restaurant createRestaurant(String name, String location) {
        Restaurant r = new Restaurant(name, location);
        r.addMenuItem(new MenuItem("N1", "Chicken Biryani", 300));
        r.addMenuItem(new MenuItem("N2", "Mutton Curry", 350));
        return r;
    }
}

