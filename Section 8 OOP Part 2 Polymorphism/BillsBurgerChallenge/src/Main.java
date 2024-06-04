public class Main {
    public static void main(String[] args) {
        MealOrder defaultMeal = new MealOrder();
//        defaultMeal.printOrder();

        // meal with a burger, drink and side items of your choice with up to 3 toppings
        MealOrder fullMeal = new MealOrder(new Side("soup"), new Drink("lemonade", "medium"), new Burger());
//        fullMeal.addToppings();
//        fullMeal.printOrder();


        //meal with a deluxe burger, all items, drink, side item, toppings up to 5, included in burger price
        MealOrder deluxeMeal = new MealOrder(new Side("fries"), new Drink("coke", "large"), new DeluxeBurger());
        deluxeMeal.addToppings();
        deluxeMeal.printOrder();

        deluxeMeal.changeDrinkSize();
        deluxeMeal.printOrder();
    }
}
