package mititelu.laura.javamasterclass.challenges.composition;

public class SmartKitchen {

    private CoffeeMaker coffeeMaker;

    private DishWasher dishWasher;

    private Refrigerator refrigerator;

    public SmartKitchen(){
        coffeeMaker = new CoffeeMaker();
        dishWasher = new DishWasher();
        refrigerator = new Refrigerator();
    }

    public SmartKitchen(CoffeeMaker coffeeMaker, DishWasher dishWasher, Refrigerator refrigerator) {
        this.coffeeMaker = coffeeMaker;
        this.dishWasher = dishWasher;
        this.refrigerator = refrigerator;
    }

    public void addWater(){
        coffeeMaker.setHasWorkToDo(true);
        System.out.println("Adding water");
    }

    public void pourMilk(){
        refrigerator.setHasWorkToDo(true);
        System.out.println("Pouring milk");
    }

    public void loadDishWasher(){
        dishWasher.setHasWorkToDo(true);
    }

    public void doKitchenWork(){
        refrigerator.orderFood();
        dishWasher.doDishes();
        coffeeMaker.brewCoffee();
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }
}

