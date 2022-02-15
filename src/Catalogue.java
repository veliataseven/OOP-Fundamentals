import java.util.HashMap;
import java.util.Map;

public class Catalogue {
    //    private static Map<String, Product> productMap = Map.of(
//            "Electric Toothbrush", new Product("electric toothbrush", 3550, ProductType.PHYSICAL),
//            "Baby Alarm", new Product("baby alarm", 4999, ProductType.DIGITAL)
//    );
    private static Map<String, Product> productMap = new HashMap<>();

    static {
        productMap.put("Electric Toothbrush", new Product("electric toothbrush",
                3550,
                ProductType.PHYSICAL));
        productMap.put("Baby Alarm", new Product("baby alarm",
                4999,
                ProductType.DIGITAL));
    }

    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }


}
