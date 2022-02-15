import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<LineItem> lineItems = new ArrayList<>();

    public void addLineItem(LineItem lineItem) {
        lineItems.add(lineItem);
    }

    public int getTotalCost() {
//        return products.stream().mapToInt(product -> product.getPrice()).sum();
//        return lineItems.stream()
//                .mapToInt(lineItem -> lineItem.getProduct().getPrice())
//                .sum();
        return lineItems.stream().mapToInt(LineItem::getPrice).sum();
    }

    @Override
    public String toString() {
        return "ShoppingCart{" + "lineItems=" + lineItems + '}';
    }
}
