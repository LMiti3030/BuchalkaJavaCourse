package mititelu.laura.javamasterclass.challenges.oopmaster;

public class Main {

    public static void main(String[] args) {
        //testingItem();

        //testingBurger();

        //testingMealOrderNoArgs();

        //testingMealOrderThreeArgs();

        testingMealOrderDeluxeBurger();
    }

    private static void testingMealOrderDeluxeBurger() {

        MealOrder deluxeOrder = new MealOrder("deluxe", "7-up", "chili");
        deluxeOrder.addBurgerToppings("Avocado", "bacon", "lettuce", "cheese", "mayo");
        deluxeOrder.setDrinkSize("small");
        deluxeOrder.printItemizedList();

    }

    private static void testingMealOrderThreeArgs() {
        MealOrder secondMeal = new MealOrder("turkey", "7-up", "chili");
        secondMeal.addBurgerToppings("lettuce", "cheese","mayo");
        secondMeal.setDrinkSize("small");
        secondMeal.printItemizedList();
    }

    private static void testingMealOrderNoArgs() {

        MealOrder regularMeal = new MealOrder();
        regularMeal.addBurgerToppings("bacon", "cheese","mayo");
        regularMeal.setDrinkSize("large");
        regularMeal.printItemizedList();


    }

    private static void testingBurger() {
        Burger burger = new Burger("regular", 4.0);
        burger.addToppings("bacon", "cheese", "mayo");
        burger.printItem();
    }

    private static void testingItem() {
        Item coke = new Item("drink", "coke", 1.5);
        coke.printItem();
        coke.setSize("large");
        coke.printItem();

        Item avocado  = new Item("topping", "avocado", 1.5);
        avocado.printItem();
    }

}
