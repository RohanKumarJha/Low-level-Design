package factories;

import model.Restaurant;

public interface IRestaurantFactory {
    Restaurant createRestaurant(String name, String location);
}
