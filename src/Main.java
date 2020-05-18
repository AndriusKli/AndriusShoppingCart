import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingItem;

public class Main {
    public static void main(String[] args) {
        ShoppingCartImp shoppingCartImp = new ShoppingCartImp();
        shoppingCartImp.addShoppingItem(new ShoppingItem("Televizorius", 2000));
        shoppingCartImp.addShoppingItem(new ShoppingItem("Bakla", 50));
//        System.out.println(shoppingCartImp.calculateTotalPrice());
        shoppingCartImp.setLocked(true);
//        DiscountDecoratedShoppingCart discountDecoratedShoppingCart = new DiscountDecoratedShoppingCart(shoppingCartImp, 0.2);
//        System.out.println(discountDecoratedShoppingCart.calculateTotalPrice());
//
////        shoppingCartImp.addShoppingItem(new ShoppingItem("Bakla", 50));
//        discountDecoratedShoppingCart.addShoppingItem(new ShoppingItem("Bakla", 50));
//        discountDecoratedShoppingCart.addShoppingItem(new ShoppingItem("Bakla", 50));
//
//        System.out.println(  discountDecoratedShoppingCart.getShoppingCartItems());
//        System.out.println(discountDecoratedShoppingCart.isLocked());

        DiscountDecoration discountDecoration = new DiscountDecoration(shoppingCartImp, 0.2);
        System.out.println(discountDecoration.calculateTotalPrice());
//        discountDecoration.addShoppingItem(new ShoppingItem("Bakla", 50));
//        shoppingCartImp.clearShoppingCart();

    }
}
