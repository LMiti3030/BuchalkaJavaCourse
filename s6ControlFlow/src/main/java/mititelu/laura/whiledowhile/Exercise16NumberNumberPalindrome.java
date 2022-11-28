package mititelu.laura.whiledowhile;

public class Exercise16NumberNumberPalindrome {

    public static boolean isPalindrome(int number){

        int reverse = 0;
        int tempNumber = number;
        do{
            int lastDigit = tempNumber % 10;
            tempNumber = tempNumber /10;
            reverse = (reverse * 10) + lastDigit;
        } while (tempNumber != 0);

        return number == reverse;
    }

}
