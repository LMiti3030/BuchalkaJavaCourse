package mititelu.laura.challenges.classes;

public class BankAccount {

    private String accountNumber;
    private Double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void withdrawFunds(double amount){
        if(amount > balance ){
            System.out.println("Insufficient funds. Cannot withdraw " + amount);
            return ;
        }
        System.out.println("Withdrawing "+ amount);
        this.balance = this.balance - amount;

    }

    public void depositFunds(double amount){
        if(amount < 0 ){
            System.out.println("Negative amount. Cannot deposit " + amount);
            return ;
        }
        System.out.println("Depositing " + amount);
        this.balance += amount;

    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
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
}
