import java.util.Optional;

public class Order {

    private Customer customer;
    private ShoppingCart cart;
    private Optional<Payment> payment;

    public Order(Customer customer, ShoppingCart cart, Optional<Payment> payment) {
        this.customer = customer;
        this.cart = cart;
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Order{" + "\n\t" + "customer=" + customer + "\n\t" + "cart=" + cart + "\n\t" + "payment=" + payment + '}';
    }

    public ShoppingCart getCart() {
        return cart;
    }
}
