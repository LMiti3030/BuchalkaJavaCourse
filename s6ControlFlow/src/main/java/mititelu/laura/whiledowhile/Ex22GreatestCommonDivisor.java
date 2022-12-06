package mititelu.laura.whiledowhile;

/**
 * Greatest Common Divisor
 * Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
 * If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
 * The method should return the greatest common divisor of the two numbers (int).
 * The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder).
 */

public class Ex22GreatestCommonDivisor {

    private Ex22GreatestCommonDivisor(){}

    public static int getGreatestCommonDivisor(int a, int b){
        if( a < 10 || b < 10){
            return -1;
        }
        int maxI = (a < b) ? a : b;
        int gcd = 1;
        for(int i = 1; i <= maxI; i++){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
}
