import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingCart {
    private List<LineItem> lineItems = new ArrayList<>();

    private void addLineItem(LineItem lineItem) {
        lineItems.add(lineItem);
    }

    public void addLineItem(Product prod, int quantity){
        this.addLineItem(new LineItem(prod, quantity));
    }

  /*  public List<LineItem> getLineItems() {
        return lineItems;
    }*/

    /*    public List<LineItem> getLineItems() {
        return new ArrayList<>(lineItems);
    }*/

    public List<LineItem> getLineItems() {
        return lineItems.stream().map(LineItem::new).collect(Collectors.toList());
    }

    public int getTotalCost() {
/*        return products.stream().mapToInt(product -> product.getPrice()).sum();
        return lineItems.stream()
                .mapToInt(lineItem -> lineItem.getProduct().getPrice())
                .sum();*/
        return lineItems.stream().mapToInt(LineItem::getPrice).sum();
    }

    @Override
    public String toString() {
        return "ShoppingCart{" + "lineItems=" + lineItems + '}';
    }
}
