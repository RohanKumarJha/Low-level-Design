import java.util.ArrayList;
import java.util.List;

class RestaurantManager {
    private static RestaurantManager instance;
    private List<Restaurant> restaurants;

    private RestaurantManager() {
        restaurants = new ArrayList<>();
    }

    public static RestaurantManager getInstance() {
        if (instance == null) {
            instance = new RestaurantManager();
        }
        return instance;
    }

    public void addRestaurant(Restaurant r) {
        restaurants.add(r);
    }

    public List<Restaurant> findByLocation(String location) {
        List<Restaurant> result = new ArrayList<>();
        for (Restaurant r : restaurants) {
            if (r.getLocation().equalsIgnoreCase(location)) {
                result.add(r);
            }
        }
        return result;
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurants;
    }
}