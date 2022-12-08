package mititelu.laura.polymorphism;

public class ElectricCar extends Car{

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize){
        super(description);
        this.avgKmPerCharge = (avgKmPerCharge <= 0) ? -1 : avgKmPerCharge;
        this.batterySize = (batterySize <= 0) ? -1 : batterySize;
    }

    @Override
    public void startEngine(){
        System.out.println("Starting electric engine");
    }

    @Override
    public void drive(){
        startEngine();
        runEngine();
        System.out.println("Driving " + this.getClass().getSimpleName());
    }

    @Override
    protected void runEngine(){
        System.out.println("Consuming electricity");
    }
}
