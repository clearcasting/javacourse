package dev.lpa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            System.out.println("""
                Grocery list available actions:
                0 - to shutdown
                1 - to add item(s) to list (comma delimited list)
                2 - to remove any items (comma delimited list)
                Enter a number for which action you want to do:""");

            switch (scanner.nextInt()) {
                case 0 -> flag = false;
                case 1 -> addItems(groceryList);
                case 2 -> removeItems(groceryList);
                default -> System.out.println("Invalid choice\n");
            }
        }
    }

    private static void addItems(ArrayList<String> groceryList) {
        System.out.println("Please enter grocery items to add.");
        String itemsToAdd = scanner.nextLine();
        String[] splitList = itemsToAdd.split(",");

        for (String element: splitList) {
            String trimmed = element.trim();
            if (!groceryList.contains(trimmed)) {
                groceryList.add(trimmed);
            } else {
                System.out.println(trimmed + " was not added due to being a duplicate.");
            }
        }
        groceryList.sort(Comparator.naturalOrder());
        System.out.println("Grocery list after adding items: \n" + groceryList);
        System.out.println();
    }

    private static void removeItems(ArrayList<String> groceryList) {
        System.out.println("Please enter grocery items to delete.");
        String itemsToDelete = scanner.nextLine();
        String[] splitList = itemsToDelete.split(",");

        for (String element: splitList) {
            String trimmed = element.trim();
            groceryList.remove(trimmed);
        }

        groceryList.sort(Comparator.naturalOrder());
        System.out.println("Grocery list after deleting items: \n" + groceryList);
        System.out.println();
    }
}
