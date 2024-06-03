public class Refrigerator {
    private boolean hasWorkToDo;

    public Refrigerator() {

    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Making food.");
        }
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
