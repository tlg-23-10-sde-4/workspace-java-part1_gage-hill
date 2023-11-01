package com.coffee;

public class Coffee {
    private CoffeeType coffeeType;
    private Roast roast;
    private Size size;
    private double price;

    public Coffee(CoffeeType coffeeType, Roast roast, Size size, double price) throws IllegalArgumentException {
        this.coffeeType = coffeeType;
        this.roast = roast;
        this.size = size;
        setPrice(price);
    }

    public void confirmingOrder() {
        System.out.println("Please review your order: " + "coffeeType: " + getCoffeeType() + " roast: "
                + getRoast() +  " size: " + getSize() + " total: $" + getPrice());
    }

    public String getCoffeeType() {
        return String.valueOf(coffeeType);
    }

    public void setCoffeeType(CoffeeType coffeeType) throws IllegalArgumentException {
        if (coffeeType != null) {
            this.coffeeType = coffeeType;
        }
        else {
            throw new IllegalArgumentException("Please select a coffeeType.");
        }
    }

    public String getRoast() {
        return String.valueOf(roast);
    }

    public void setRoast(Roast roast) throws IllegalArgumentException {
        if (roast != null) {
            this.roast = roast;
        }
        else {
            throw new IllegalArgumentException("Please select a roast.");
        }
    }

    public String getSize() {
        return String.valueOf(size);
    }

    public void setSize(Size size) throws IllegalArgumentException {
        if (size != null) {
            this.size = size;
        }
        throw new IllegalArgumentException("Please select a size.");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws IllegalArgumentException {
        if (price >= 0) {
            this.price = price;
        }
        else {
            throw new IllegalArgumentException("Price must be a positive value.");
        }
    }

    @Override
    public String toString() {
        return String.format("Thank you for your order: %s, %s, %s, $%.2f",
                getCoffeeType(), getRoast(), getSize(), getPrice());
    }
}