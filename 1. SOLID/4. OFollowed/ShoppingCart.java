import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> list = new ArrayList<>();

    public void addProduct(Product product) {
        list.add(product);
        System.out.println(product.productName+" added successfully");
    }

    public double calculatePrice() {
        double totalPrice = 0;
        for(Product i : list) {
            totalPrice += i.productPrice;
        }
        System.out.println("The total price of items is "+totalPrice);
        return totalPrice;
    }
}
