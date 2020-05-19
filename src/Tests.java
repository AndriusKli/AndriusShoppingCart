import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingCart;
import lt.infobalt.itakademija.javalang.exam.shoppingcart.BaseShoppingCartDecoratorTest;

public class Tests extends BaseShoppingCartDecoratorTest {


    @Override
    protected ShoppingCart getDecoratedShoppingCart(ShoppingCart shoppingCart, double v, double v1) {
        return new DiscountedMyShoppingCart(new TaxedMyShoppingCart(shoppingCart, v1), v);
    }

    @Override
    protected ShoppingCart getDiscountAppliedShoppingCart(ShoppingCart shoppingCart, double v) {
        return new DiscountedMyShoppingCart(shoppingCart, v);
    }

    @Override
    protected ShoppingCart getTaxAppliedShoppingCart(ShoppingCart shoppingCart, double v) {
        return new TaxedMyShoppingCart(shoppingCart, v);
    }

    @Override
    protected ShoppingCart getLockedFromModificationShoppingCart(ShoppingCart shoppingCart) {
        return new LockedMyShoppingCart(shoppingCart);
    }

}
