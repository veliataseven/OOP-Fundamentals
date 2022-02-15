public class LineItem {

    private Product product;
    private int quantity;

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return quantity * product.getPrice();
    }

    @Override
    public String toString() {
        return "LineItem{" + "product=" + product + ", quantity=" + quantity + '}';
    }
}
