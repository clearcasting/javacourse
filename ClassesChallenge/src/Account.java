public class Account {
    private String number = "";
    private double balance = 0;
    private String customerName = "";
    private String customerEmail = "";
    private String customerPhone = "";

    public Account() {
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String email, String phone) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhone = phone;

    }

    public void depositFunds(double fundsToDeposit) {
        if (fundsToDeposit <= 0) {
            System.out.println("You cannot deposit no value.");
        }  else {
            balance += fundsToDeposit;
            System.out.println("You have successfully deposited: $" + fundsToDeposit);
            System.out.println("Your updated balance is: $" + balance);
        }
    }

    public void withdrawFunds(double fundsToWithdraw) {
        if(balance - fundsToWithdraw < 0) {
            System.out.println("Insufficient funds");
        } else {
            balance -= fundsToWithdraw;
            System.out.println("You have successfully withdrawn: $" + fundsToWithdraw);
            System.out.println("Your updated balance is: $" + balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

}
