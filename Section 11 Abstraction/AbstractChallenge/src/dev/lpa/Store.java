package dev.lpa;

import java.util.ArrayList;

record OrderItem(int quantity, ProductForSale product) {

}

public class Store {
    static private ArrayList<ProductForSale> inventory;

    public static void main(String[] args) {
        inventory = new ArrayList<>();
        inventory.add(new Keyboard("Keyboard", 100.0, "Logitech G Pro"));
        inventory.add(new Monitor("Monitor", 350.0, "ASUS TUF Gaming VG27AQL3A"));
        inventory.add(new Mouse("Mouse", 120, "Logitech G Pro X Superlight"));

        ArrayList<OrderItem> order1 = new ArrayList<>();
        addToOrder(order1, 0, 1);
        addToOrder(order1, 1, 1);
        addToOrder(order1, 2, 1);
        printOrder(order1);

        ArrayList<OrderItem> order2 = new ArrayList<>();
        addToOrder(order2, 1, 5);
        printOrder(order2);
    }

    public static void addToOrder(ArrayList<OrderItem> order, int orderIndex, int quantity) {
        order.add(new OrderItem(quantity, inventory.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order) {
        double sum = 0;
        System.out.println("ORDER ITEMS: ");
        for (OrderItem item: order) {
            item.product().printPriceLineItem(item.quantity());
            sum += item.product().calculatePrice(item.quantity());
        }
        System.out.println("-".repeat(35));
        System.out.printf("TOTAL TRANSACTION AMOUNT: $%.2f%n", sum);
        System.out.println("HAVE A NICE DAY! :)\n");
    }
}
