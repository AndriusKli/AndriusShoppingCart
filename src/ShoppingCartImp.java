import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingCart;
import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingCartModificationException;
import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingItem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ShoppingCartImp implements ShoppingCart {

    private List<ShoppingItem> shoppingItems;
    private boolean locked;

    public ShoppingCartImp() {
        this.shoppingItems = new ArrayList<>();
        this.locked = false;
    }

    @Override
    public void addShoppingItem(ShoppingItem shoppingItem) {
        if (isLocked()) {
            throw new ShoppingCartModificationException();
        } else {
            shoppingItems.add(shoppingItem);
        }
    }

    @Override
    public void removeShoppingItem(ShoppingItem shoppingItem) {
        if (isLocked()) {
            throw new ShoppingCartModificationException();
        } else {
            shoppingItems.remove(shoppingItem);
        }
    }

    @Override
    public void clearShoppingCart() {
        if (isLocked()) {
            throw new ShoppingCartModificationException();
        } else {
            shoppingItems.clear();
        }
    }

    @Override
    public Collection<ShoppingItem> getShoppingCartItems() {
        return shoppingItems;
    }

    @Override
    public double calculateTotalPrice() {
        return shoppingItems.stream().mapToDouble(ShoppingItem::getPrice).sum();
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public boolean isLocked() {
        return locked;
    }
}
