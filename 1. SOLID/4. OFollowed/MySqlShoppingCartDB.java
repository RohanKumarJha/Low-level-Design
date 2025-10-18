public class MySqlShoppingCartDB implements ShoppingCartDB {

    ShoppingCart shoppingCart;

    public MySqlShoppingCartDB(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public void saveToDB() {
        System.out.println("Save all "+shoppingCart.productList.size()+" products to mySql database");
    }
    
}
