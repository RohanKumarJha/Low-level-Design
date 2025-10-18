import java.util.List;

public class ShoppingCartInvoice {
    
    ShoppingCart shoppingCart;

    public ShoppingCartInvoice(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void invoice() {
        List<Product> productList = shoppingCart.productList;
        for(Product p : productList) {
            System.out.print("ProductId is "+p.productId+" ");
            System.out.print("ProductName is "+p.productName+" ");
            System.out.print("ProductPrice is "+p.price+" ");
            System.out.println();
        }
    }
}
