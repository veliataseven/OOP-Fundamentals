import java.util.UUID;

public class Payment implements PaymentIntf {

    private PaymentMethod paymentMethod;
    private int value;
    private UUID transactionId;

    public Payment(PaymentMethod paymentMethod, int value, UUID transactionId) {
        this.paymentMethod = paymentMethod;
        this.value = value;
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentMethod=" + paymentMethod +
                ", value=" + value +
                ", transactionId=" + transactionId +
                '}';
    }

    @Override
    public void execute() {
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }
}
