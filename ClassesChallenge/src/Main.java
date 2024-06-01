public class Main {
    public static void main(String[] args) {
        Account richmond = new Account("12345", 500,
                "Rich Mond", "myemail@rich.com", "(123)-456-789");

        System.out.println(richmond.getNumber());
        System.out.println(richmond.getBalance());
//        richmond.setNumber("12345");
//        richmond.setCustomerPhone("(123)-456-789");
//        richmond.setBalance(1000.00);
//        richmond.setCustomerName("Rich Mond");
//        richmond.setCustomerEmail("myemail@rich.com");

        richmond.depositFunds(49);

        richmond.withdrawFunds(49);

        richmond.withdrawFunds(99);
        richmond.withdrawFunds(1);

        richmond.depositFunds(100);
        richmond.withdrawFunds(45.55);
        richmond.withdrawFunds(54.46);

        richmond.withdrawFunds(54.45);
    }
}
