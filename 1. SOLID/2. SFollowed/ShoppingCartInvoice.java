import java.util.List;

public class ShoppingCartInvoice {
    ShoppingCart shoppingCart;

    public ShoppingCartInvoice(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void invoice() {
        List<Product> list = shoppingCart.list;
        for(Product i : list) {
            System.out.print(i.productId+" ");
            System.out.print(i.productName+" ");
            System.out.print(i.productPrice);
            System.out.println();
        }
    }
}
