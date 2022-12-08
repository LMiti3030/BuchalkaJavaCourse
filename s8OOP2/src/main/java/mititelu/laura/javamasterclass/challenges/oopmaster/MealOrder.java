package mititelu.laura.javamasterclass.challenges.oopmaster;

public class MealOrder {

    private Burger burger;
    private Drink drink;
    private SideItem sideItem;

    public MealOrder() {
        this.burger = new Burger("Regular", 2.25);
        this.drink = new Drink("Coke", "small");
        this.sideItem = new SideItem("Fries");
    }

    public MealOrder(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }
}
