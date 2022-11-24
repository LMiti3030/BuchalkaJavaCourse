package mititelu.laura.forex;

public class PrimeNumberChallenge {

    public static int getNoPrimeNumber(int start, int stop){
        int count = 0;
        for(int i = start; i< stop; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        printFirstThreePrimeNumbers();
    }

    public static void printFirstThreePrimeNumbers(){
        int count = 0;
        for(int i = 99; i < 1000 && count < 3; i++){
            if(isPrime(i)){
                System.out.println(i);
                count++;
            }
        }
    }


    public static boolean isPrime(int no){
        if(no <=2){
            return (no == 2); //1 is no longer considered prime number
        }
        for(int i = 2; i <= no/2; i++){
            if(no % i == 0){
                return false;
            }
        }
        return true;
    }

}
