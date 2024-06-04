public class Car {
    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public String startEngine() {
        String className = this.getClass().getSimpleName();
        return className + " engine running";
    }

    public String accelerate() {
        String className = this.getClass().getSimpleName();
        return  className + " is accelerating";
    }

    public String brake() {
        String className = this.getClass().getSimpleName();
        return className + " is braking";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return this.getClass().getSimpleName() + " engine running";
    }

    @Override
    public String accelerate() {
        return this.getClass().getSimpleName() + " is accelerating";
    }

    @Override
    public String brake() {
        return this.getClass().getSimpleName() + " is braking";
    }
}

class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return this.getClass().getSimpleName() + " engine running";
    }

    @Override
    public String accelerate() {
        return this.getClass().getSimpleName() + " is accelerating";
    }

    @Override
    public String brake() {
        return this.getClass().getSimpleName() + " is braking";
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return this.getClass().getSimpleName() + " engine running";
    }

    @Override
    public String accelerate() {
        return this.getClass().getSimpleName() + " is accelerating";
    }

    @Override
    public String brake() {
        return this.getClass().getSimpleName() + " is braking";
    }
}
