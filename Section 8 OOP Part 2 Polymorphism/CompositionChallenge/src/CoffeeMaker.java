public class CoffeeMaker {
    private boolean hasWorkToDo;

    public CoffeeMaker() {

    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Brewing Coffee.");
        }
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
