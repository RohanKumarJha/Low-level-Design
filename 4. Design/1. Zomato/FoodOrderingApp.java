import factories.*;
import managers.*;
import model.*;
import strategies.*;
import services.NotificationService;

public class FoodOrderingApp {
    public static void main(String[] args) {
        IRestaurantFactory vegFactory = new VegRestaurantFactory();
        IRestaurantFactory nonVegFactory = new NonVegRestaurantFactory();

        RestaurantManager manager = RestaurantManager.getInstance();
        manager.addRestaurant(vegFactory.createRestaurant("Green Garden", "Delhi"));
        manager.addRestaurant(nonVegFactory.createRestaurant("Spice Grill", "Mumbai"));

        Customer rohan = new Customer("Rohan");
        Restaurant delhiRestaurant = manager.findByLocation("Delhi").get(0);

        CartManager cartManager = new CartManager();
        cartManager.addItemToCart(rohan, delhiRestaurant.getMenu().get(0), delhiRestaurant, 2);

        double total = rohan.getCart().getTotalCost();
        Order order = new Order(rohan, delhiRestaurant, total);
        order.setPaymentStrategy(new UpiPayment());
        order.pay();

        NotificationService notify = new NotificationService();
        notify.notifyUser(rohan, "Your order #" + order.getId() + " has been successfully paid!");
    }
}
