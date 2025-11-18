package managers;
import model.*;
import java.util.*;

public class RestaurantManager {
    private static RestaurantManager instance;
    private List<Restaurant> restaurants = new ArrayList<>();

    private RestaurantManager() {}

    public static RestaurantManager getInstance() {
        if (instance == null) instance = new RestaurantManager();
        return instance;
    }

    public void addRestaurant(Restaurant r) {
        restaurants.add(r);
    }

    public List<Restaurant> findByLocation(String loc) {
        List<Restaurant> res = new ArrayList<>();
        for (Restaurant r : restaurants)
            if (r.getLocation().equalsIgnoreCase(loc)) res.add(r);
        return res;
    }

    public List<Restaurant> getAll() { return restaurants; }
}

