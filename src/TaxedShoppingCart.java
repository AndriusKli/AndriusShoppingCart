import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingCart;

public class TaxedShoppingCart extends ShoppingCartImp {
    private double tax;

    public TaxedShoppingCart(ShoppingCart shoppingCart, double tax) {
        super(shoppingCart);
        this.tax = tax;
    }

    @Override
    public double calculateTotalPrice() {
        return shoppingCart.calculateTotalPrice() + (shoppingCart.calculateTotalPrice() * tax);
    }
}
