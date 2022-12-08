package mititelu.laura.javamasterclass.challenges.oopmaster;

public class Item {

    private String type;
    private String name;

    private double price;
    private String size ="MEDIUM"; //default

    public Item(String type, String name, double price) {
        this.type = (type != null) ? type.toUpperCase() : null;
        this.name = (name != null) ? name.toUpperCase() : null;
        this.price = (price > 0) ? price : 0.0;
    }

    public double getBasePrice(){
        return price;
    }

    public double getAdjustedPrice(){
        return switch (size){
            case "SMALL" -> getBasePrice() - 0.5;
            case "LARGE" -> getBasePrice() + 1;
            default -> getBasePrice();
        };
    }

    public String getName(){
        if("SIDE".equals(type) || "DRINK".equals(type)){
            return size + " " + name;
        }
        return this.name;
    }

    public void setSize(String size) {
        this.size = (size != null) ? size.toUpperCase() : null ;
    }

    public static void printItem(String name, double price){
        System.out.printf("%20s:%6.2f%n", name, price); //20 characters for string + 6 characters up to the floating point + 2 decimal places
    }

    public void printItem(){
        Item.printItem(getName(), getAdjustedPrice());
    }
}
