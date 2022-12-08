package mititelu.laura.polymorphism;

public class HybridCar extends Car{

    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders){
        super(description);
        this.avgKmPerLitre = (avgKmPerLitre <= 0) ? -1 : avgKmPerLitre;
        this.batterySize = (batterySize <= 0 ) ? -1 : batterySize;
        this.cylinders = (cylinders <= 0 ) ? -1 : cylinders;
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
        System.out.println("Burning gas");
    }

}
