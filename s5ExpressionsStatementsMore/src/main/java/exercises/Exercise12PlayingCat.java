package exercises;

public class Exercise12PlayingCat {

    public static boolean isCatPlaying(boolean isSummer, int temperature){
        if(isSummer){
            return isTempBetweenInInterval(temperature, 25,45);
        }
        return isTempBetweenInInterval(temperature, 25,35);
    }


    private static boolean isTempBetweenInInterval(int temperature, int min, int max) {
        return temperature <= max && temperature >= min;
    }



}
