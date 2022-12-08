package mititelu.laura.javamasterclass.exercises.billsburgers;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = (price < 0) ? 0.0 : price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = (price < 0) ? 0.0 : price;;
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = (price < 0) ? 0.0 : price;;
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = (price < 0) ? 0.0 : price;;
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = (price < 0) ? 0.0 : price;;
    }


    public double itemizeHamburger(){
        System.out.printf("%s hamburger on a %s roll with %s, price is %.2f%n", name, breadRollType, meat, price);
        double totalPrice = price;
        if(addition1Name != null){
            System.out.printf("Added %s for an extra %s%n", addition1Name, addition1Price);
            totalPrice+=addition1Price;
        }
        if(addition2Name != null){
            System.out.printf("Added %s for an extra %s%n", addition2Name, addition2Price);
            totalPrice+=addition2Price;
        }
        if(addition3Name != null){
            System.out.printf("Added %s for an extra %s%n", addition3Name, addition3Price);
            totalPrice+=addition3Price;
        }
        if(addition4Name != null){
            System.out.printf("Added %s for an extra %s%n", addition4Name, addition4Price);
            totalPrice+=addition4Price;
        }
        return totalPrice;
    }


}
