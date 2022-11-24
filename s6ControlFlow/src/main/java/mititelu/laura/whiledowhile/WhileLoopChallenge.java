package mititelu.laura.whiledowhile;

import java.util.stream.Stream;

public class WhileLoopChallenge {

    /**
    method isEvenNumber - param int
     return true/false
     from 5 to 20 check and print only the even numbers
     */


    public static void printEvenNumbersFrom5To20(){
        int count = 5;
        do{
            if(isEvenNumber(count)){
                System.out.println(count);
            }
            count++;
        } while (count <= 20);
    }

    public static void printEvenNumbersFrom5To20UsingLambdas(){
        Stream.iterate(5, i -> i<=20,  i -> i = i+1)
                .filter( i -> isEvenNumber(i))
                .forEach(System.out::println);
    }

    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }
}
