package mititelu.laura;

public class Exercise26LargestPrime {

    private Exercise26LargestPrime(){}


    public static int getLargestPrime(int number){
        if(number < 2){
            return -1;
        }
        int maxPrime = 1;
        for(int i = 2; i<= number; i++){
            if( number % i == 0){
                boolean isPrime = true;
                for(int j = 2; j < i; j++){
                    if(i % j == 0){
                        isPrime =false;
                    }
                }
                if(isPrime){
                    maxPrime = i;
                }

            }
        }
        if(maxPrime == 1){
            return -1;
        }
        return maxPrime;
    }



//    public static int getLargestPrime(int number){
//        if(number < 2){
//            return -1;
//        }
//        int maxPrime = 1;
//        for(int i = 2; i< number; i++){
//            if( (number % i == 0) && isPrime(i)){
//                maxPrime = i;
//            }
//        }
//        if(maxPrime == 1){
//            return -1;
//        }
//        return maxPrime;
//    }
//
//    private static boolean isPrime (int number){
//        for( int i = 2; i < number ; i++){
//            if(number % i == 0){
//                return false;
//            }
//        }
//        return true;
//    }
}
