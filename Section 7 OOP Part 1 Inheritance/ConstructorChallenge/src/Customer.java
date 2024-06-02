public class Customer {
    private String name = "";
    private double limit = 0;
    private String email = "";

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }

    public Customer() {
        this("Default name", "default@email.com");
    }

    public Customer(String email, String name) {
        this(name, 1000, email);
    }

    public Customer(String name, double limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }
}
