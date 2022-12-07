package mititelu.laura.javamasterclass.challenges.composition;

public class UsingSmartKitchen {

    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();
        kitchen.getRefrigerator().orderFood();
        kitchen.getDishWasher().doDishes();
        kitchen.getCoffeeMaker().brewCoffee();


    }
}
