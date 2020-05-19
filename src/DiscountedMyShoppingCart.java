import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingCart;

public class DiscountedMyShoppingCart extends MyShoppingCart {
    private double discount;

    public DiscountedMyShoppingCart(ShoppingCart shoppingCart, double discount) {
        super(shoppingCart);
        this.discount = discount;
    }

    @Override
    public double calculateTotalPrice() {
        return super.calculateTotalPrice() - (super.calculateTotalPrice() * discount);
    }
}
