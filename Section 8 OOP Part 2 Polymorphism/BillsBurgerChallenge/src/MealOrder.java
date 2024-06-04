import java.util.Scanner;

public class MealOrder {
    private Side side;
    private Drink drink;
    private Burger burger;

    public MealOrder() {
        this.burger = new Burger();
//        this.drink = "small coke";
//        this.side = "fries";
    }

    public MealOrder(Side side, Drink drink, Burger burger) {

    }

    public void addToppings() {
        burger.addToppings();
    }

    public void changeDrinkSize() {

    }

    public void printOrder() {
        //price of burger
        //price of any extra toppings
        //drink price based on size
        //side item price
        //print total
    }
}

class Burger {
    private String type;
    private double price;
    private String toppings;

    public Burger() {
        this.type = "regular burger";
        this.price = 10.00;
    }

    public Burger(String type, double price) {
        if (type == "deluxe") {
            this.type = type;
            this.price = 15.00;
        } else {
            this.type = type;
            this.price = price;
        }
    }

    public void addToppings() {
        Scanner scanner = new Scanner(System.in);
        int toppingsCounter = 0;
        double toppingsTotal = 0;
        String introduction = """
                Please select up to 3 additional toppings.
                Deluxe burgers may choose up to 5 toppings.
                Available choices are:
                Onions: $0.25
                Mushrooms: $0.25
                Pickles: $0.50
                BBQ Sauce: $0.50
                Bacon: $1.00
                
                If you are not interested in any additional extra toppings enter any key.
                """;
        System.out.println(introduction);


        loop: while (type != "deluxe" ? toppingsCounter <= 3 : toppingsCounter <= 5) {
            String result = scanner.nextLine();
            switch (result.toLowerCase()) {
                case "pickles", "bbq sauce" -> toppingsTotal += 0.5;
                case "onions", "mushrooms" -> toppingsTotal += 0.25;
                case "bacon" -> toppingsTotal += 1;
                default -> {
                    break loop;
                }
            }
            toppingsCounter++;
        }

        price += (type != "deluxe" ? toppingsTotal : 0);
    }
}

class Drink {
    private String type;
    private String size;
    private double price;

    public Drink() {
        this.type = "coke";
        this.size = "small";
        this.price = 1.75;
    }

    public Drink(String type, String size) {
        this.type = type;
        this.size = size;

        switch (size) {
            case "small" -> price = 1.75;
            case "medium" -> price = 2.50;
            case "large" -> price = 3.00;
        }
    }

    public void changeDrinkSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to change your drink to a small, medium, or large? To cancel enter any key.");
        String newSize = scanner.nextLine().toLowerCase();

        switch (newSize) {
            case "small", "large", "medium" -> {
                if (size == newSize) {
                    System.out.println("Drink size is already " + newSize);
                } else {
                    size = newSize;
                }
            }
            default -> System.out.println("Size change cancelled");
        }
    }
}