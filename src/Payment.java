import java.util.UUID;

public class Payment {

    private CreditCard creditCard;
    private int value;
    private UUID uuid;

    public Payment(CreditCard creditCard, int value, UUID uuid) {
        this.creditCard = creditCard;
        this.value = value;
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "Payment{" + "creditCard=" + creditCard + ", value=" + value + ", uuid=" + uuid + '}';
    }
}
