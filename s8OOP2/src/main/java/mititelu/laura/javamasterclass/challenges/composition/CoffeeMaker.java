package mititelu.laura.javamasterclass.challenges.composition;

public class CoffeeMaker {

    private boolean hasWorkToDo;


    public void brewCoffee(){
        if(hasWorkToDo){
            System.out.println("Brewing the coffee");
            hasWorkToDo = false;
        }
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

}
