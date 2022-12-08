package mititelu.laura.javamasterclass.challenges.oopmaster;

public class MealOrder {

    private Burger burger;
    private Item drink;
    private Item side;

    public MealOrder(){
        this("regular", "coke", "fries");
    }

    public MealOrder(String burgerType, String drinkType, String sideType){
        if(burgerType != null){
            if(burgerType.equalsIgnoreCase("deluxe")){
                this.burger = new DeluxeBurger(burgerType, 8.5);
            }  else {
                this.burger = new Burger(burgerType, 4.0);
            }
        }
        this.drink = new Item("drink", drinkType,1.0);
        this.side = new Item("side", sideType, 1.5);
    }

    public double getTotalPrice(){
        if(burger instanceof DeluxeBurger){
            return burger.getAdjustedPrice();
        }
        return ( (side == null ) ? 0.0 : side.getAdjustedPrice() )+
                ( (drink == null ) ? 0.0 : drink.getAdjustedPrice() )+
                ((burger == null ) ? 0.0 : burger.getAdjustedPrice());

    }


    public void printItemizedList(){
        if(burger != null){
            burger.printItem();

        }
        if(drink != null){
            printSubItem(drink);
        }
        if(side != null){
            printSubItem(side);
        }
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }

    private void printSubItem(Item item){
        if(burger instanceof DeluxeBurger){
            Item.printItem(item.getName(), 0);
        } else {
            item.printItem();
        }
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3){
        if(burger != null){
            burger.addToppings(extra1, extra2, extra3);
        }
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3, String extra4, String extra5){
        if(burger != null){
            if(burger instanceof DeluxeBurger deluxeBurger){
                deluxeBurger.addToppings(extra1, extra2, extra3, extra4, extra5);
            } else {
                burger.addToppings(extra1, extra2, extra3);
            }
        }
    }

    public void setDrinkSize(String size){
        if(drink != null){
            drink.setSize(size);
        }
    }

}
