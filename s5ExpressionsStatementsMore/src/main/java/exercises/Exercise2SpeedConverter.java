package exercises;

public class Exercise2SpeedConverter {

    public static final double MILE_TO_KM = 1.609;

    public static long toMilesPerHour(double kilometersPerHour){

        if(kilometersPerHour < 0){
            return -1;
        }

        long roundedCalculatedValue = (long) Math.round((kilometersPerHour * (1/ MILE_TO_KM)));
        return roundedCalculatedValue;
    }

    public static void printConversion(double kilometersPerHour){

        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if(milesPerHour < 0){
            System.out.println("Invalid Value");
        } else{
            System.out.println(kilometersPerHour + "km/h = " + milesPerHour + " mi/h");
        }

    }


}
