package dev.lpa;

public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type.toUpperCase();
        this.price = price;
        this.description = description.toUpperCase();
    }

    public double calculatePrice(int quantity) {
        return quantity * price;
    }

    public void printPriceLineItem(int quantity) {
        System.out.print(quantity + " ");
        showDetails();
        System.out.println();
    }

    public abstract void showDetails();
}

class Keyboard extends ProductForSale {
    public Keyboard(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.printf("%s - %s - $%.2f", type, description, price);
    }
}

class Mouse extends ProductForSale {
    public Mouse(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.printf("%s - %s - $%.2f", type, description, price);
    }
}

class Monitor extends ProductForSale {
    public Monitor(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.printf("%s - %s - $%.2f", type, description, price);
    }
}
