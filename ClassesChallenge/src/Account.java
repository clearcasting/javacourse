public class Account {
    private String accountNumber = "";
    private double accountBalance = 0;
    private String customerName = "";
    private String email = "";
    private String phoneNumber = "";

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double fundsToDeposit) {
        if (fundsToDeposit <= 0) {
            System.out.println("You cannot deposit no value.");
        }  else {
            accountBalance += fundsToDeposit;
            System.out.println("You have successfully deposited: $" + fundsToDeposit);
            System.out.println("Your updated balance is: $" + accountBalance);
        }
    }

    public void withdrawFunds(double fundsToWithdraw) {
        if(accountBalance - fundsToWithdraw < 0) {
            System.out.println("Insufficient funds");
        } else {
            accountBalance -= fundsToWithdraw;
            System.out.println("You have successfully withdrawn: $" + fundsToWithdraw);
            System.out.println("Your updated balance is: $" + accountBalance);
        }
    }

}
