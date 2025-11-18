package model;
import java.util.*;

public class Cart {
    private Restaurant restaurant;
    private List<CartItem> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem item, Restaurant restaurant, int qty) {
        if (this.restaurant == null) this.restaurant = restaurant;
        if (!this.restaurant.equals(restaurant))
            throw new IllegalArgumentException("Cart can contain items from only one restaurant.");

        items.add(new CartItem(item, qty));
    }

    public double getTotalCost() {
        return items.stream().mapToDouble(i -> i.getMenuItem().getPrice() * i.getQuantity()).sum();
    }

    public List<CartItem> getItems() { return items; }
    public Restaurant getRestaurant() { return restaurant; }
}
