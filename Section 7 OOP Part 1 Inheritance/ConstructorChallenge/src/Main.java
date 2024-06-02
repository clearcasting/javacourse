public class Main {
    public static void main(String[] args) {

        Customer bob = new Customer("Bob", 300, "bob@email.com");

        System.out.println(bob.getName());
        System.out.println(bob.getEmail());
        System.out.println(bob.getLimit());

        Customer jimmy = new Customer("slippin@jimmy.com", "Jimmy");

        System.out.println(jimmy.getName());
        System.out.println(jimmy.getEmail());
        System.out.println(jimmy.getLimit());

        Customer saul = new Customer();

        System.out.println(saul.getName());
        System.out.println(saul.getEmail());
        System.out.println(saul.getLimit());
    }
}
