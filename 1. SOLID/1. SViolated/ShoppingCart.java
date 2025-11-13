import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> list = new ArrayList<>();

    public void addProduct(Product product) {
        list.add(product);
        System.out.println(product.getProductName()+" added successfully");
    }

    public void calculatePrice() {
        double totalPrice = 0.0;
        for(Product i : list) {
            totalPrice += i.getPrice();
        }
        System.out.println("The total price of products is "+totalPrice);
    }

    public void printInvoice() {
        for(Product i : list) {
            System.out.print(i.getProductId()+" ");
            System.out.print(i.getProductName()+" ");
            System.out.print(i.getPrice());
            System.out.println();
        }
    }

    public void saveToDb() {
        System.out.println("All the "+list.size()+" elements save to db");
    }
}
