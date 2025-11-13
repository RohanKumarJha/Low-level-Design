public class ShoppingCartPayment {
    
    ShoppingCart shoppingCart;

    public ShoppingCartPayment(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void payThrough(String paymentWay) {
        if(paymentWay.toLowerCase().equals("credit")) {
            System.out.println("Payment of rupees "+shoppingCart.calculatePrice()+" through Credit Card");
        } else if(paymentWay.toLowerCase().equals("debit")) {
            System.out.println("Payment of rupees "+shoppingCart.calculatePrice()+" through debit card");
        } else if(paymentWay.toLowerCase().equals("cash")) {
            System.out.println("Payment of rupees "+shoppingCart.calculatePrice()+" through debit cash");
        } else {
            System.out.println("Payment way doesn't exist");
        }
    }
}
