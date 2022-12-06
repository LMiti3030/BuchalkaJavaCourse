package mititelu.laura.whiledowhile;

/**
 * Shared Digit
 *
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
 */


public class Exercise19SharedDigit {

    private Exercise19SharedDigit(){}

    public static boolean hasSharedDigit( int first, int second){
        if(!isWithinRange(first) || !isWithinRange(second)){
            return false;
        }
        int[] firstDigits = getDigits(first,2);
        int[] secondDigits = getDigits(second,2);
        for(int i = 0; i < 2; i ++){
            for(int j = 0; j< 2; j++){
                if(firstDigits[i] == secondDigits[j]){
                    return true;
                }
            }
        }
        return false;
    }

    private static int[] getDigits(int number, int length){
        int[] digits = new int[length];
        for(int i = 0; i < length; i ++){
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;

    }

    private static boolean isWithinRange(int number){
        return number >= 10 && number <= 99;
    }

}
