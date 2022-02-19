public class DigitalProduct extends Product {

    public DigitalProduct(String name, int price) {
        super(name, price);
    }

    @Override
    public PriceCalculator createPriceCalculator() {
        return new DigitalProductPriceCalculator(this);
    }

    @Override
    public void ship() {
        // make product available for download
    }
}
