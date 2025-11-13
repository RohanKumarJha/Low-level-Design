public class ShoopingCartDb {
    ShoppingCart shoppingCart;

    public ShoopingCartDb(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void saveToDb() {
        System.out.println("All "+shoppingCart.list.size()+" product sae to db");
    }
}
