package model;
import java.util.*;

public class Restaurant {
    private String name;
    private String location;
    private List<MenuItem> menu;

    public Restaurant(String name, String location) {
        this.name = name;
        this.location = location;
        this.menu = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    public List<MenuItem> getMenu() { return menu; }
    public String getName() { return name; }
    public String getLocation() { return location; }

    @Override
    public String toString() {
        return name + " (" + location + ")";
    }
}
