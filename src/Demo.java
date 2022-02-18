import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {

        PaymentMethod eftAccount = new EftAccount("jane@janedoe.com");

        // create a new payment using that EFT account 
        PaymentIntf payment = new Payment(eftAccount, 100, UUID.randomUUID());

        // create a payment with the same characteristics but with added verification
        PaymentIntf highValuePayment = new HighValuePayment(payment);

        // make a reversible payment from either one 
        ReversiblePayment reversiblePayment = new ReversiblePayment(payment);
        System.out.println(reversiblePayment);
        ReversiblePayment reversibleHighValuePayment = new ReversiblePayment(highValuePayment);
        System.out.println(reversibleHighValuePayment);

      /*  Customer janeDoe = new Customer ("Jane Doe", 5420793615183044L);

        Product toothBrush = Catalogue.getProduct("Electric Toothbrush");
        Product babyAlarm = Catalogue.getProduct("Baby Alarm");
        Product warAndPeace = Catalogue.getProduct("War and Peace (e-book)");

        ShoppingCart cart = new ShoppingCart();
        LineItem toothbrushes = new LineItem(toothBrush, 2);

        cart.addLineItem(toothbrushes);
        cart.addLineItem(new LineItem(babyAlarm, 1));
        cart.addLineItem(new LineItem(warAndPeace, 1));*/

     /*   Customer acme = new BusinessCustomer("Acme Products",
                4556642663443553L,
                BusinessCustomer.BusinessSize.LARGE);
        Customer globex = new BusinessCustomer("Globex Corp",
                5463503666563574L,
                BusinessCustomer.BusinessSize.LARGE);
        Customer saveTheWorld = new NonprofitCustomer("Save The World", 5381428244287646L);

        List<Customer> customers = List.of(janeDoe, acme, globex, saveTheWorld);

        // count how many customers are on each discount rate
        Map<Integer, Long> discountMap = customers.stream()
                .collect(Collectors.groupingBy (Customer::calculateDiscount, Collectors.counting()));
        System.out.println(discountMap);

        //alternative way to count, using iteration instead of streams
        discountMap = new HashMap<>();
        for (Customer c : customers) {
            discountMap. merge(c.calculateDiscount(), 1L, Long::sum);
        }
        System.out.println (discountMap);
        System.out.println(acme);*/
    }
}
