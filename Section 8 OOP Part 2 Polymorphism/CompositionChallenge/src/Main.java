public class Main {
    public static void main(String[] args) {
        SmartKitchen smartKitchen = new SmartKitchen();

        smartKitchen.addWater();
        smartKitchen.loadDishwasher();
        smartKitchen.pourMilk();

        smartKitchen.doKitchenWork();
    }
}
