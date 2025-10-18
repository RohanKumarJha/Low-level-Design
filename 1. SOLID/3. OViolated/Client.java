public class Client {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(new Product(1L, "Laptop", 15000.0));
        shoppingCart.addProduct(new Product(2L, "Smartphone", 12000.0));
        shoppingCart.addProduct(new Product(3L, "IPad", 105000.0));
        System.out.println("The total price is "+shoppingCart.CalculatePrice());
        ShoppingCartInvoice shoppingCartInvoice = new ShoppingCartInvoice(shoppingCart);
        shoppingCartInvoice.invoice();
        ShoppingCartDB shoppingCartDB = new ShoppingCartDB(shoppingCart);
        shoppingCartDB.saveToDb();
    }
}
