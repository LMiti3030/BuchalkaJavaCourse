package mititelu.laura.polymorphism;

public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void startEngine(){

    }

    public void drive(){
        startEngine();
        runEngine();
    }

    protected void runEngine(){
        System.out.println("Running engine");
    }
}
