import java.util.HashMap;
import java.util.Map;

public class Catalogue {

    public final static int SHIPPING_RATE = 5;

    private static Map<String, Product> productMap = Map.of(
            "Electric Toothbrush", new Product("electric toothbrush",
                    3000,
                    ProductType.PHYSICAL,
                    4000),
            "Baby Alarm", new Product("baby alarm",
                    5000,
                    ProductType.PHYSICAL,
                    1000),
            "War and Peace (e-book)", new Product("War and Peace (e-book)",
                    1000,
                    ProductType.DIGITAL,
                    -1)
    );
/*    private static Map<String, Product> productMap = new HashMap<>();

    static {
        productMap.put("Electric Toothbrush", new Product("electric toothbrush",
                3000,
                ProductType.PHYSICAL,
                4000));
        productMap.put("Baby Alarm", new Product("baby alarm",
                5000,
                ProductType.PHYSICAL,
                1000));
        productMap.put("War and Peace (e-book)", new Product("War and Peace (e-book)",
                1000,
                ProductType.DIGITAL,
                -1));
    }*/

    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }

}
