public class Main {
    public static void main(String[] args) {
        Account richmond = new Account();

        richmond.setAccountNumber("12345");
        richmond.setPhoneNumber("(123)-456-789");
        richmond.setAccountBalance(1000.00);
        richmond.setCustomerName("Rich Mond");
        richmond.setEmail("myemail@rich.com");

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
