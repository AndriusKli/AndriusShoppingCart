import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingCart;

public class TaxDecoratedShoppingCart extends ShoppingCartImp {
    private ShoppingCart shoppingCart;
    private double tax;

    public TaxDecoratedShoppingCart(ShoppingCart shoppingCart, double tax) {
        this.shoppingCart = shoppingCart;
        this.tax = tax;
    }

    @Override
    public double calculateTotalPrice() {
        return shoppingCart.calculateTotalPrice() + (shoppingCart.calculateTotalPrice() * tax);
    }
}
