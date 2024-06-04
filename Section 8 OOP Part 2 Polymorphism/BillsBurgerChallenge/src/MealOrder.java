import java.util.Scanner;

public class MealOrder {
    private Side side;
    private Drink drink;
    private Burger burger;

    public MealOrder() {
        this.burger = new Burger();
        this.drink = new Drink();
        this.side = new Side();
    }

    public MealOrder(Side side, Drink drink, Burger burger) {
        this.side = side;
        this.drink = drink;
        this.burger = burger;
    }

    public void addToppings() {
        burger.addToppings();
    }

    public void changeDrinkSize() {
        drink.changeDrinkSize();
    }

    public void printOrder() {
        System.out.printf("""
                Price of burger: $%.2f
                Price of toppings: $%.2f
                Price of drink: $%.2f
                Price of side item: $%.2f
                
                Your total is $%.2f%n
                """,
                burger.getPrice(), getClass().getSimpleName() == "DeluxeBurger" ? 0 : burger.getToppingsPrice(),
                drink.getPrice(), side.getPrice(), calculateTotal());
    }

    public double calculateTotal() {
        String className = getClass().getSimpleName();
        double total = className == "DeluxeBurger" ? (burger.getPrice() + drink.getPrice() + side.getPrice())
                : (burger.getPrice() + burger.getToppingsPrice() + drink.getPrice() + side.getPrice());

        return total;
    }
}

class Burger {
    private double price;
    private double toppingsPrice;

    public Burger() {
        this.price = 10.00;
    }

    public void addToppings() {
        Scanner scanner = new Scanner(System.in);
        int toppingsCounter = 0;
        String className = getClass().getSimpleName();

        String introduction = """
                If you are not interested in any additional extra toppings enter any key.
                Please select up to 3 additional toppings.
                Deluxe burgers may choose up to 5 toppings.
                
                Available choices are:
                Onions: $0.25
                Mushrooms: $0.25
                Pickles: $0.50
                BBQ Sauce: $0.50
                Bacon: $1.00
                """;
        System.out.println(introduction);

        loop: while (className != "DeluxeBurger" ? toppingsCounter < 3 : toppingsCounter < 5) {
            String result = scanner.nextLine();
            switch (result.toLowerCase()) {
                case "pickles", "bbq sauce" -> toppingsPrice += 0.5;
                case "onions", "mushrooms" -> toppingsPrice += 0.25;
                case "bacon" -> toppingsPrice += 1;
                default -> {
                    break loop;
                }
            }
            toppingsCounter++;
        }
        if (className == "DeluxeBurger") toppingsPrice = 0;
    }

    public double getPrice() {
        return price;
    }

    public double getToppingsPrice() {
        return toppingsPrice;
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
        setPriceBySize(size);
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
                    setPriceBySize(size);
                }
            }
            default -> System.out.println("Size change cancelled");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPriceBySize(String size) {
        switch (size) {
            case "small" -> price = 1.75;
            case "medium" -> price = 2.50;
            case "large" -> price = 3.00;
        }
    }
}

class Side {
    private String type;
    private double price;

    public Side() {
        this.type = "fries";
        this.price = 1.50;
    }

    public Side(String type) {
        this.type = type;
        this.price = 1.50;
    }

    public double getPrice() {
        return price;
    }
}

class DeluxeBurger extends Burger {
    private double price;

    public DeluxeBurger() {
        this.price = 13.00;
    }

    @Override
    public double getPrice() {
        return price;
    }
}