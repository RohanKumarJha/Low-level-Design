public class Client {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(new Product(1L, "Laptop", 10000.0));
        shoppingCart.addProduct(new Product(2L, "SmartPhone", 8000.0));
        shoppingCart.addProduct(new Product(3L, "Helmet", 1200.0));
        System.out.println(shoppingCart.calculatePrice());
        shoppingCart.printInvoice();
        shoppingCart.saveToDb();
    }
}
