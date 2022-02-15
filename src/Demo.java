import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        Product toothBrush = Catalogue.getProduct("Electric Toothbrush");
        Product babyAlarm = Catalogue.getProduct("Baby Alarm");

//      Product toothbrush = new Product("Electric Toothbrush", 3550, ProductType.PHYSICAL);
//      Product babyAlarm = new Product("Baby Alarm", 4999, ProductType.DIGITAL);

        ShoppingCart cart = new ShoppingCart();

        cart.addLineItem(new LineItem(toothBrush, 1));
        cart.addLineItem(new LineItem(babyAlarm, 2));
        System.out.println(cart);
        System.out.println(cart.getTotalCost());

        Customer johnDoe = new Customer("John Doe", 5420234563456366L);
        Optional<Order> order = johnDoe.checkout(cart);
        System.out.println("order = " + order);
    }
}
