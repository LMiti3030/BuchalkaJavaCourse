package mititelu.laura.methodchallenge;

public class MethodOverloadingChallenge {


    public static final int FEET_TO_INCH = 12;
    public static final double INCH_TO_CM = 2.54;

    public static double convertToCentimeters (int heightInInch){
        //inches to cm
        //return no of cm as double
        //1inch = 2.54cm;
        return INCH_TO_CM * heightInInch;
    }

    public static double convertToCentimeters (int heightInFeet, int remainingHeightInInches){
        //person 5 foot and 8 inches => pass values 5 and 8 as params
        //convert feet and inches to just inches and then call the first method
        //returns a double - cm
        //1foot = 12inches


       // return convertToCentimeters((heightInFeet * 12) + remainingHeightInInches);
        //OR MORE READABLE CODE
        int feetToInches = heightInFeet * FEET_TO_INCH;
        int totalInches = heightInFeet + remainingHeightInInches;
        double result = convertToCentimeters(totalInches);
        return result;
    }
}
