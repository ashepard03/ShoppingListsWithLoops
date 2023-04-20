package org.yearup.shopping;

public class Item {

    private String productID;
    private String description;
    private double price;
    private boolean inStock;


    public Item(String productID, String description, double price, boolean inStock) {
        this.productID = productID;
        this.description = description;
        this.price = price;
        this.inStock = inStock;
    }

    public String getProductID() {
        return productID;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isInStock() {
        return inStock;
    }

    @Override
    public String toString() {
        return "Item{" +
                "productID='" + productID + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", inStock=" + inStock +
                '}';
    }
}
