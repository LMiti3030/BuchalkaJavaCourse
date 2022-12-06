package mititelu.laura.whiledowhile;


/**
 * Last Digit Checker
 * Write a method named hasSameLastDigit with three parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
 * The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.
 * Write another method named isValid with one parameter of type int.
 * The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise return false.
 */

public class Exercise20LastDigitChecker {

    private Exercise20LastDigitChecker(){}

    public static boolean hasSameLastDigit(int a, int b, int c){
        if(!isValid(a) || !isValid(b) || !isValid(c)){
            return false;
        }
        int count = 1;
        int[] digits = {a % 10, b % 10, c % 10};

        for(int i = 0; i < digits.length-1; i++){
            for(int j = i+1; j < digits.length; j++) {
                if(digits[i] == digits[j]){
                    count++;
                }
            }

        }
        return count >= 2;
    }

    public static boolean isValid(int number){
        return number >= 10 && number <= 1000;
    }
}
