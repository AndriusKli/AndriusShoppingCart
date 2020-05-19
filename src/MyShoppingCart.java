import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingCart;
import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingItem;

import java.util.Collection;

public class MyShoppingCart implements ShoppingCart {

    ShoppingCart shoppingCart;

    public MyShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public void addShoppingItem(ShoppingItem shoppingItem) {
        shoppingCart.addShoppingItem(shoppingItem);
    }

    @Override
    public void removeShoppingItem(ShoppingItem shoppingItem) {
        shoppingCart.removeShoppingItem(shoppingItem);
    }

    @Override
    public void clearShoppingCart() {
        shoppingCart.clearShoppingCart();
    }

    @Override
    public Collection<ShoppingItem> getShoppingCartItems() {
        return shoppingCart.getShoppingCartItems();
    }

    @Override
    public double calculateTotalPrice() {
        return shoppingCart.calculateTotalPrice();
    }
}