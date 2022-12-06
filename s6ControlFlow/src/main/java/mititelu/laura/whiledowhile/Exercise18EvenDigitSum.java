package mititelu.laura.whiledowhile;

/**
 * Even Digit Sum
 *
 * Write a method named getEvenDigitSum with one parameter of type int called number. 
 *
 * The method should return the sum of the even digits within the number. 
 *
 * If the number is negative, the method should return -1 to indicate an invalid value.
 */

public class Exercise18EvenDigitSum {

    private Exercise18EvenDigitSum(){}

    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        int sum = 0;
        int remainingNumber = number;
        int digit = 0;
        while( remainingNumber > 0){
            digit = remainingNumber % 10;
            if(digit % 2 == 0){
                sum += digit;
            }
            remainingNumber /= 10;
        }

        return sum;
    }


}
