package mititelu.laura.polymorphism;

public class Main {

    public static void main(String[] args) {
        Car electricCar = new ElectricCar("Tesla", 250, 400 );
        electricCar.drive();

        Car gasPoweredCar = new GasPoweredCar("Ford", 10, 8 );
        gasPoweredCar.drive();

        Car hybridCar = new HybridCar("Honda", 7.5, 400, 6 );
        hybridCar.drive();
    }

}
