public abstract class Product {

    private final String name;
    private int price;
    private float discount;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

   /* public int getPrice() {
        int shippingCost = type.getShippingCost(weight);
      *//*  if(type == ProductType.PHYSICAL) {
            shippingCost = weight * Catalogue.SHIPPING_RATE;
        } else {
            shippingCost = 0;
        }*//*
        return (price * (100 - discount)) / 100 + shippingCost;
    }*/

    public int getPrice() {
        int shippingCost = calculateShippingCost();
        return Math.round((1-discount) * price) + shippingCost;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Product{" + "name='" + name + '\'' + ", price=" + price + ", discount=" + discount + '}';
    }

    public abstract int calculateShippingCost();
}
