package mititelu.laura.javamasterclass.exercises.billsburgers;

public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1price;

    private String healthyExtra2Name;
    private double healthyExtra2price;

    public HealthyBurger(String meat, double price){
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1price = (price < 0) ? 0.0 : price;;
    }

    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2price = (price < 0) ? 0.0 : price;;
    }

    public double itemizeHamburger(){

        double totalPrice = super.itemizeHamburger();
        if(healthyExtra1Name != null){
            System.out.printf("Added %s for an extra %s%n", healthyExtra1Name, healthyExtra1price);
            totalPrice+=healthyExtra1price;
        }
        if(healthyExtra2Name != null){
            System.out.printf("Added %s for an extra %s%n", healthyExtra2Name, healthyExtra2price);
            totalPrice+=healthyExtra2price;
        }
        return totalPrice;
    }
}
