import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingCart;

public class TaxedMyShoppingCart extends MyShoppingCart {
    private double tax;

    public TaxedMyShoppingCart(ShoppingCart shoppingCart, double tax) {
        super(shoppingCart);
        this.tax = tax;
    }

    @Override
    public double calculateTotalPrice() {
        return shoppingCart.calculateTotalPrice() + (shoppingCart.calculateTotalPrice() * tax);
    }
}
