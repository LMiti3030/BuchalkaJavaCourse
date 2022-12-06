package mititelu.laura.challenges.classes;

public class ClassesChallenge {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setBalance(150.5);
        System.out.println("Balance " + account.getBalance());
        account.depositFunds(130.5);
        System.out.println("Balance " + account.getBalance());
        account.withdrawFunds(123.4);
        System.out.println("Balance " + account.getBalance());
        account.withdrawFunds(200.6);
        System.out.println("Balance " + account.getBalance());
    }

}
