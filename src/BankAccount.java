import java.util.Optional;
import java.util.UUID;

public class BankAccount implements PaymentMethod{

    private final int sortCode;
    private final long accountNumber;

    public BankAccount(int sortCode, long accountNumber) {
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }

    @Override
    public Optional<Payment> mkPayment(int value) {
        return Optional.of(new Payment(this, value, UUID.randomUUID()));
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "sortCode=" + sortCode +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
