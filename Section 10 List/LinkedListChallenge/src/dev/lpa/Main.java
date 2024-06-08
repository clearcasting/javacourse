package dev.lpa;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Itinerary itinerary = new Itinerary();
        itinerary.addTown("Adelaide", 1374);
        itinerary.addTown("Adelaide", 1374);
        itinerary.addTown("Alice Springs", 2771);
        itinerary.addTown("Brisbane", 917);
        itinerary.addTown("Darwin", 3972);
        itinerary.addTown("Melbourne", 877);
        itinerary.addTown("Perth", 3923);
        ListIterator<Town> iterator = itinerary.getItinerary().listIterator(1);

        printMenu();

        boolean flag = true;
        while (flag) {
            String selection = scanner.nextLine().toUpperCase();
            switch (selection.charAt(0)) {
                case 'F' -> {
                    if (iterator.hasNext()) {
                        System.out.println("Going forwards towards: ");
                        System.out.printf("%s - %d%n",iterator.next().getName(), iterator.next().getDistance());
                    }
                }
                case 'B' -> {
                    if (iterator.hasPrevious()) {
                        System.out.println("Going back towards: ");
                        System.out.printf("%s - %d%n",iterator.previous().getName(), iterator.previous().getDistance());
                    }
                }
                case 'L' -> itinerary.printList();
                case 'M' -> printMenu();
                default -> flag = false;
            }
        }
    }

    public static void printMenu() {
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit
                """);
    }
}

class Town {
    private String name;
    private int distance;

    public Town(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }
}

class Itinerary {
    private LinkedList<Town> itinerary;

    public Itinerary() {
        this.itinerary = new LinkedList<>();
        addTown("Sydney", 0);
    }

    public void addTown(String name, int distance) {
        Town newTown = new Town(name, distance);

        boolean found = false;
        for (Town town: itinerary) {
            if (town.getName().equalsIgnoreCase(name)){
                System.out.println("Duplicate location " + town.getName() + " found.");
                found = true;
                break;
            }
        }
        if(!found) {
            itinerary.add(newTown);
        };
    }

    public void printList() {
        for (Town town: itinerary) {
            System.out.printf("%s - %d km%n", town.getName(), town.getDistance());
        }
    }

    public LinkedList<Town> getItinerary() {
        return itinerary;
    }
}