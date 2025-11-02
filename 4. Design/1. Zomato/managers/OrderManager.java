package managers;
import model.*;
import java.util.*;

public class OrderManager {
    private static OrderManager instance;
    private List<Order> orders = new ArrayList<>();

    private OrderManager() {}

    public static OrderManager getInstance() {
        if (instance == null) instance = new OrderManager();
        return instance;
    }

    public void addOrder(Order o) {
        orders.add(o);
    }

    public List<Order> getOrders() { return orders; }
}
