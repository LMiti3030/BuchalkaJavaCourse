package mititelu.laura.switchex;

public class EnhancedSwitchChallenge {

    /**
     * Day of the week challenge
     * int param for day
     * 0 - Sunday
     * 1 - Monday etc
     * any no not netween 0 ond 6 -> "Invalid day"
     */

    public static String getDayOfWeek(int day){
        return switch (day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };
    }

}
