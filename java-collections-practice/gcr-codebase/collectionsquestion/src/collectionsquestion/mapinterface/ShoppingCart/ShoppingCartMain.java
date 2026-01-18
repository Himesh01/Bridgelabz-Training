package collectionsquestion.mapinterface.ShoppingCart;

public class ShoppingCartMain {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Laptop", 55000);
        cart.addItem("Phone", 25000);
        cart.addItem("Headphones", 2000);
        cart.addItem("Mouse", 1200);

        cart.showCartInOrder();
        cart.showSortedByPrice();
    }
}