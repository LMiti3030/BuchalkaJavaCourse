package mititelu.laura.methodchallenge;

public class SecondsAndMinutesChallenge {

    //method that  takes time represented in seconds as param
    //transform the seconds into hours
    //display the time in hours with remaining minutes and seconds in a string
    //transformation in 2 steps 2 methods getDurationString
    //first mtd param int named seconds
    //second mtd 2 params named minutes and seconds, both ints
    //both methods return a string in the format XXh YYm ZZs
    //first method calls the second

    //validation: seconds param should be >=0
    //validation 2nd method: min param should be >=0 and the seconds param should be >=0 and <=59
    //if passed invalid value, print some meaningful message to the user

    public static String getDurationString(int seconds){

        if(seconds < 0){
            return "Seconds should be greater than 0. Actual value received: "+ seconds;

        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }

    public static String getDurationString(int minutes,int seconds){

        if(minutes < 0){
            return "Minutes should be greater than 0. Actual value received: "+ minutes;
        }
        if(seconds >= 0 && seconds >= 59 ){
            return "Seconds should be between 0 and 59. Actual value received: "+ seconds;
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        String result = String.format("%dh %dm %ds", hours,remainingMinutes,seconds);
        return result;
    }
}
