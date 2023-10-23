package com.coffee.CoffeeKiosk;

public class CoffeeKiosk {
    private String coffeeType;          // constraint: ["espresso", "cappuccino", "iced"]
    private String roast;               // constraint: ["light", "medium", "dark"]
    private String size = "Medium";     // constraint: ["small", "medium", "large" (default "medium")]
    private double price;

    public CoffeeKiosk(String espresso, String dark, String medium, double price) {
    }

    public void confirmingOrder() {
        System.out.println("Please review your order: " + coffeeType + " " + size + " Roast: " + roast + " Total: $" + price + " Order Now");
    }

    public void missingOrder() {
        System.out.println("Please make the following selection before completing your order: Size " + size + " Order Now");
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    public String getRoast() {
        return roast;
    }

    public void setRoast(String roast) {
        this.roast = roast;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    public String toString() {
        return String.format("Thank you for your order: coffeeType=%s, roast=%s, size=%s, price=$%s", getCoffeeType()
                , getRoast(), getSize(), getPrice());
    }
}