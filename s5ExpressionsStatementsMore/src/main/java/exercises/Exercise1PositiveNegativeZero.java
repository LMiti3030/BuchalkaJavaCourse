package exercises;

public class Exercise1PositiveNegativeZero {


    public static void checkNumber(int number){
        if(number > 0 ){
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else  {
            System.out.println("zero");
        }
    }

    public static String checkNumberForUnitTesting(int number){
        if(number > 0 ){
            return "positive";
        } else if (number < 0) {
            return "negative";
        } else  {
            return "zero";
        }
    }
}
