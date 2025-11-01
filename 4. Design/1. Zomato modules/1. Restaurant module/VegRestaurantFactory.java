

class VegRestaurantFactory implements IRestaurantFactory {
    
    @Override
    public Restaurant createRestaurant(String name, String location) {
        Restaurant r = new Restaurant(name, location);
        r.addMenuItem(new MenuItem("V1", "Paneer Butter Masala", 200));
        r.addMenuItem(new MenuItem("V2", "Dal Makhani", 180));
        r.addMenuItem(new MenuItem("V3", "Veg Biryani", 220));
        return r;
    }
}