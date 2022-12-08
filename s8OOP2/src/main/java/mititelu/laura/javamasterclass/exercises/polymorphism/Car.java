package mititelu.laura.javamasterclass.exercises.polymorphism;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car( int cylinders, String name){
        this.name = name;
        this.cylinders = (cylinders < 0) ? 0  : cylinders;
        engine = true;
        wheels = 4;
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }

    public String accelerate(){
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
