import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
    }

    public double CalculatePrice() {
        double price = 0;
        for(Product i : productList) {
            price += i.price;
        } return price;
    }
}
