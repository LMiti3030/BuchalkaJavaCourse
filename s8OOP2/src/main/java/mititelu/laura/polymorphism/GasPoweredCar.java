package mititelu.laura.polymorphism;

public class GasPoweredCar extends Car{

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders){
        super(description);
        this.avgKmPerLitre = (avgKmPerLitre <= 0) ? -1 : avgKmPerLitre;
        this.cylinders = (cylinders <= 0) ? -1 : cylinders;
    }

    @Override
    public void startEngine(){
        System.out.println("Starting gas engine");
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
