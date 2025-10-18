public class MongoDbShoppingCartDB implements ShoppingCartDB {

    ShoppingCart shoppingCart;

    public MongoDbShoppingCartDB(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public void saveToDB() {
        System.out.println("Save all "+shoppingCart.productList.size()+" products to mongodb database");
    }
    
}
