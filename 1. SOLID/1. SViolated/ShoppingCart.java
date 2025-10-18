import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculatePrice() {
        double price = 0;
        for(int i=0; i<products.size(); i++) {
            price += products.get(i).price;
        } return price;
    }

    public void printInvoice() {
        for(int i=0; i<products.size(); i++) {
            System.out.print("ProductId : "+products.get(i).productId+" ");
            System.out.print("ProductName : "+products.get(i).productName+" ");
            System.out.print("ProductPrice : "+products.get(i).price);
            System.out.println();
        }
    }

    public void saveToDb() {
        System.out.println("Save to database successfully");
    }

}