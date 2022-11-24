package mititelu.laura.forex;

import java.util.stream.Stream;

public class Sum3And5Challenge {

    //sum all the numbers from 1 to 1000 that can be divided by both 3 and 5
    //print the numbers that meet the above conditions
    //break once you have found 5 numbers that me the conditions above
    //print the sum of the numbers

    public static void main(String[] args) {
        printSumAndFirstFiveNoDividedByBoth3And5();
    }

    //standard method
    public static void printSumAndFirstFiveNoDividedByBoth3And5() {
        int count = 0;
        int sum = 0;
        for(int i = 1; i <= 1000 ; i++) {
            if((i % 3 == 0) && (i % 5 == 0)){
                count ++;
                sum += i;
                System.out.println(i);
            }
            if(count == 5){
                break;
            }
        }
        System.out.println(sum);
    }

    public static void printFirstFiveNoDividedByBoth3And5UsingLambda(){
        System.out.println(
                Stream.iterate(1, i -> i+1)
                        .filter(i -> i % 3 == 0 && i % 5 == 0)
                        .limit(5)
                        .peek(System.out::println)
                        .reduce(0, (a, b)-> a+b));
    }


}
