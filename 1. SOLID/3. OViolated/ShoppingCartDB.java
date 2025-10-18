public class ShoppingCartDB {
    
    ShoppingCart shoppingCart;

    public ShoppingCartDB(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void saveToDb() {
        System.out.println("Save all the "+ shoppingCart.productList.size()+" products to mysql DB.......");
    }
}
