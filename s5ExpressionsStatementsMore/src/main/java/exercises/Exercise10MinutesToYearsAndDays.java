package exercises;

public class Exercise10MinutesToYearsAndDays {

    public static void printYearsAndDays ( long minutes) {
        if(minutes < 0){
            System.out.println("Invalid Value");
            return;
        }
        long years = minutes / (60 * 24 * 365);
        long remaining_days = ( minutes - ( years * (60 * 24 * 365)) ) / (60 * 24);
        System.out.println(minutes + " min = " + years + " y and " + remaining_days + " d");
    }
}
