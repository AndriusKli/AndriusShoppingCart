import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingCart;
import lt.infobalt.itakademija.javalang.exam.shoppingcart.BaseShoppingCartDecoratorTest;

public class Tests extends BaseShoppingCartDecoratorTest {


    @Override
    protected ShoppingCart getDecoratedShoppingCart(ShoppingCart shoppingCart, double v, double v1) {
        return new DiscountDecoratedShoppingCart(new TaxDecoratedShoppingCart(shoppingCart, v1), v);
//        return new DiscountDecoration(new TaxDecoration(shoppingCart, v1), v);
    }

    @Override
    protected ShoppingCart getDiscountAppliedShoppingCart(ShoppingCart shoppingCart, double v) {
        return new DiscountDecoratedShoppingCart(shoppingCart, v);
//        return new DiscountDecoration(shoppingCart, v);
    }

    @Override
    protected ShoppingCart getTaxAppliedShoppingCart(ShoppingCart shoppingCart, double v) {
        return new TaxDecoratedShoppingCart(shoppingCart, v);
//        return new TaxDecoration(shoppingCart, v);
    }

    @Override
    protected ShoppingCart getLockedFromModificationShoppingCart(ShoppingCart shoppingCart) {
        ShoppingCartImp lockedCart = new ShoppingCartImp();
        lockedCart.setLocked(true);
        return lockedCart;
    }

}
