package mititelu.laura.challenges.exercises.cylinder;

public class Cylinder extends Circle{

    private double height;

    public Cylinder(double radius, double height){
        super(radius);
        if(height < 0){
            this.height = 0.0;
        } else{
            this.height = height;
        }
    }

    public double getVolume(){
        return height * getArea();
    }

    public double getHeight(){
        return height;
    }


}
