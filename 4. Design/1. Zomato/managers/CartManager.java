package managers;
import model.*;

public class CartManager {
    public void addItemToCart(Customer c, MenuItem item, Restaurant r, int qty) {
        c.getCart().addItem(item, r, qty);
    }
}
