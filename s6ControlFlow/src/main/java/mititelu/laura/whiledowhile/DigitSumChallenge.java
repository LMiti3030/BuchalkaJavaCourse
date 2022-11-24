package mititelu.laura.whiledowhile;

public class DigitSumChallenge {

    public static int sumDigits(int number){
        if(number < 0)
            return -1;
        //parse the digits and sum the digits up
        int sum = 0;
        int remaining = number;
        while( remaining > 9 ){
            sum += (remaining % 10);
            remaining /= 10;
        }
        return sum + remaining;
    }
}
