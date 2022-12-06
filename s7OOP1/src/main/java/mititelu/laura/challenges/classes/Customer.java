package mititelu.laura.challenges.classes;

public class Customer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer(){
        this("Default name",100.0, "default@email.address");
    }

    public Customer(String name, String emailAddress){
        this(name, 100.0, emailAddress);
    }

    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", creditLimit=" + creditLimit +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
