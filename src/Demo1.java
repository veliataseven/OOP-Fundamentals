import java.util.Iterator;
import java.util.Optional;

public class Demo1 {
//    public static void main(String[] args) {
//        Product toothBrush = Catalogue.getProduct("Electric Toothbrush");
//        Product babyAlarm = Catalogue.getProduct("Baby Alarm");
//        Product warAndPeace = Catalogue.getProduct("War and Peace (e-book)");

//      Product toothbrush = new Product("Electric Toothbrush", 3550, ProductType.PHYSICAL);
//      Product babyAlarm = new Product("Baby Alarm", 4999, ProductType.DIGITAL);

//        ShoppingCart cart = new ShoppingCart();

//        cart.addLineItem(toothBrush, 1);
//        cart.addLineItem(babyAlarm, 2);
//        cart.addLineItem(warAndPeace, 1);
//        System.out.println("Total cost = " + cart.getTotalCost());
//        System.out.println("cart = " + cart);

//        Customer johnDoe = new Customer("John Doe", 5420234563456366L);
//        Optional<Order> order = johnDoe.checkout(cart);
//        System.out.println("order = " + order);

//        order.ifPresent(Demo1::fulfil);
//        System.out.println("order = " + order);
//    }

/*    public static void fulfil(Order o) {
        ShoppingCart cart = o.getCart();
        boolean shippingUnfinished;
        do {
            shippingUnfinished = false;
            for (Iterator<LineItem> it = cart.getLineItems().iterator(); it.hasNext(); ) {
                LineItem li = it.next();
                if (Math.random() > 0.7) {
                    shippingUnfinished = true;
                    System.out.println(li.getProduct() + " is out of stock");
                } else {
                    it.remove();
                }
            }
        } while (shippingUnfinished);
    }*/

/*    public static void fulfil(Order o) {
        ShoppingCart cart = o.getCart();
        boolean shippingUnfinished;
        do {
            shippingUnfinished = false;
            for (LineItem li : cart.getLineItems()) {
                boolean fulfilHalf = Math.random() > 0.7;
                if (fulfilHalf) {
                    li.setQuantity(li.getQuantity() / 2);
                    shippingUnfinished = true;
                } else {
                    li.setQuantity(0);
                }
                System.out.println(fulfilHalf);
            }
        } while (shippingUnfinished);
    }*/
}
