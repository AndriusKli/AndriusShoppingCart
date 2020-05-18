import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingCart;

public class DiscountDecoratedShoppingCart extends ShoppingCartImp {
    private ShoppingCart shoppingCart;
    private double discount;

    public DiscountDecoratedShoppingCart(ShoppingCart shoppingCart, double discount) {
        this.shoppingCart = shoppingCart;
        this.discount = discount;
    }

    @Override
    public double calculateTotalPrice() {
        return shoppingCart.calculateTotalPrice() - (shoppingCart.calculateTotalPrice() * discount);
    }
}
