public class LineItem {

    private Product product;
    private int quantity;

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public LineItem(LineItem li) {
        this(li.product, li.quantity);
    }

    public int calculateShippingCost() {
        return product.calculateShippingCost() * quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return "\n\t\t" + "LineItem{" + "product=" + product + ", quantity=" + quantity + ", price=" + getPrice() + '}';
    }
}
