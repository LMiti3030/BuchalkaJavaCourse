package exercises;

public class Exercise8TeenNumberChecker {

    public static boolean hasTeen(int first, int second, int third){
        return isTeen(first) || isTeen(second) || isTeen(third);
    }

    public static boolean isTeen(int number){
        return (number >= 13) && (number <= 19);
    }

}
