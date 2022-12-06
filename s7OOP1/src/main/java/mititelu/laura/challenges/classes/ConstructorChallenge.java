package mititelu.laura.challenges.classes;

public class ConstructorChallenge {

    public static void main(String[] args) {
        Customer joe = new Customer();
        System.out.println(joe);

        Customer susan = new Customer("Susan Johnson", "susan@email.com");
        System.out.println(susan);

        Customer anna  = new Customer("Anna Bobescu",200, "anna@yahoo.com");
        System.out.println(anna);
    }

}
