

class NonVegRestaurantFactory implements IRestaurantFactory {
    @Override
    public Restaurant createRestaurant(String name, String location) {
        Restaurant r = new Restaurant(name, location);
        r.addMenuItem(new MenuItem("N1", "Butter Chicken", 300));
        r.addMenuItem(new MenuItem("N2", "Mutton Curry", 350));
        r.addMenuItem(new MenuItem("N3", "Fish Fry", 250));
        return r;
    }
}