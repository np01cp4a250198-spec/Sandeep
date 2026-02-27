package week8;
public class ShoppingApp
{
    public static void main(String[] args)
    {
        ShoppingCart cart = new ShoppingCart("Laptop", 50000, 2);
        System.out.println("Cart Details:");
        cart.displayCart();
        cart.setQuantity(3);
        System.out.println("\nUpdated Cart Details:");
        cart.displayCart();
        double discountedTotal = cart.calculateDiscountedTotal(10); 
        System.out.println("\nTotal after 10% discount: Rs. " + discountedTotal);
    }
}