package exercises;

public class Exercise4BarkingDog {

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23){
            return false;
        }
        if(hourOfDay < 8 || hourOfDay >22){
            return isBarking;
        }
        return false;
    }

}
