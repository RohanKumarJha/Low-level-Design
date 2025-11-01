public class Main {
    public static void main(String[] args) {

                            // ADMIN
        IRestaurantFactory vegFactory = new VegRestaurantFactory();
        IRestaurantFactory nonVegFactory = new NonVegRestaurantFactory();

        Restaurant r1 = vegFactory.createRestaurant("Green Garden", "Delhi");
        Restaurant r2 = nonVegFactory.createRestaurant("Spice Grill", "Mumbai");
        Restaurant r3 = vegFactory.createRestaurant("Vegetable mafia", "Delhi");
        Restaurant r4 = nonVegFactory.createRestaurant("Spice fried", "Mumbai");

        RestaurantManager manager = RestaurantManager.getInstance();
        manager.addRestaurant(r1);
        manager.addRestaurant(r2);
        manager.addRestaurant(r3);
        manager.addRestaurant(r4);

        // System.out.println("📍 All Restaurants:");
        // for (Restaurant r : manager.getAllRestaurants()) {
        //     System.out.println(r);
        //     for (MenuItem m : r.getMenu()) {
        //         System.out.println("   - " + m);
        //     }
        // }


        
                                // USER

        // Find by location
        System.out.println(manager.findByLocation("delhi"));
    }
}