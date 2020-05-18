import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingCart;

public class DiscountedShoppingCart extends ShoppingCartImp {
    private double discount;

    public DiscountedShoppingCart(ShoppingCart shoppingCart, double discount) {
        super(shoppingCart);
        this.discount = discount;
    }

    @Override
    public double calculateTotalPrice() {
        return super.calculateTotalPrice() - (super.calculateTotalPrice() * discount);
    }
}
