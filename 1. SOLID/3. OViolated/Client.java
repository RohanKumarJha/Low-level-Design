public class Client {
    public static void main(String[] args) {
        Product product1 = new Product(1L, "Book", 120);
        Product product2 = new Product(2L, "Pen", 12);
        Product product3 = new Product(3L, "Matchstick", 10);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);
        shoppingCart.addProduct(product3);
        shoppingCart.calculatePrice();

        ShoppingCartInvoice shoppingCartInvoice = new ShoppingCartInvoice(shoppingCart);
        shoppingCartInvoice.invoice();

        ShoopingCartDb shoopingCartDb = new ShoopingCartDb(shoppingCart);
        shoopingCartDb.saveToDb();

        ShoppingCartPayment shoppingCartPayment = new ShoppingCartPayment(shoppingCart);
        shoppingCartPayment.payThrough("caSh");
    }
}
