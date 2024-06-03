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
        brewMaster.setHasWorkToDo(!brewMaster.isHasWorkToDo());
    }

    public void pourMilk() {
        iceBox.setHasWorkToDo(!iceBox.isHasWorkToDo());
    }

    public void loadDishwasher() {
        dishWasher.setHasWorkToDo(!dishWasher.isHasWorkToDo());
    }

    public void doKitchenWork() {
        while (brewMaster.isHasWorkToDo() || iceBox.isHasWorkToDo() || dishWasher.isHasWorkToDo()) {
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
}
