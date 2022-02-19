public class HighValuePayment implements PaymentIntf {

    private final PaymentIntf payment;

    public HighValuePayment(PaymentIntf payment) {
        this.payment = payment;
    }

    @Override
    public void execute() {
        // verify this payment
    }

    @Override
    public void setValue(int value) {
    }

    @Override
    public int getValue() {
        return 0;
    }

    @Override
    public String toString() {
        return "HighValuePayment{" +
                "payment=" + payment +
                '}';
    }
}
