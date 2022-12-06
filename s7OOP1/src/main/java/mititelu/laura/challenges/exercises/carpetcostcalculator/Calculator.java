package mititelu.laura.challenges.exercises.carpetcostcalculator;

public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        if(floor != null && carpet != null ){
            return floor.getArea() * carpet.getCost();
        }
        return 0.0;
    }

}
