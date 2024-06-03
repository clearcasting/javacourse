public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public void addWater() {
        brewMaster.setHasWorkToDo(true);
    }

    public void pourMilk() {
        iceBox.setHasWorkToDo(true);
    }

    public void loadDishwasher() {
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag) {
        if (!coffeeFlag || !fridgeFlag || !dishWasherFlag) System.out.println("There is no work to be done");
        if (coffeeFlag) addWater();
        if (fridgeFlag) pourMilk();
        if (dishWasherFlag) loadDishwasher();

        while (brewMaster.isHasWorkToDo() || iceBox.isHasWorkToDo() || dishWasher.isHasWorkToDo()) {
            doKitchenWork();
        }
    }

    public void doKitchenWork() {
        if (brewMaster.isHasWorkToDo()) {
            for (int i = 0; i < 5; i++) {
                brewMaster.brewCoffee();
            }
            brewMaster.setHasWorkToDo(false);
            System.out.println("Coffee is no longer brewing.\n");
        }

        if (iceBox.isHasWorkToDo()) {
            for (int i = 0; i < 5; i++) {
                iceBox.orderFood();
            }
            iceBox.setHasWorkToDo(false);
            System.out.println("No longer making food.\n");
        }

        if (dishWasher.isHasWorkToDo()) {
            for (int i = 0; i < 5; i++) {
                dishWasher.doDishes();
            }
            dishWasher.setHasWorkToDo(false);
            System.out.println("No longer cleaning dishes.\n");
        }
    }
}
