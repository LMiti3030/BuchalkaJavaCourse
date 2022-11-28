package mititelu.laura.forex;

import java.util.stream.Stream;

public class Exercise15SumOdd {

    public static boolean isOdd(int number) {
        if( number < 0){
            return false;
        }

        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end){
        if( start < 0 || end < 0 || end < start){
            return -1;
        }
        int sum = 0;
        for(int i = start; i <= end; i++){
            if(isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }

    public static int sumOddUsingStreams(int start, int end){
        if( start < 0 || end < 0 || end < start){
            return -1;
        }
        //List<Integer> list = Stream.iterate(start, e -> e +1).limit(end).filter( e-> isOdd(e)).collect(Collectors.toList());
        //list.forEach(System.out::println);
      //  Integer result = Stream.iterate(start, e -> e +1).filter( e-> e <= end && isOdd(e)).peek(System.out::println).reduce( 0, Integer::sum);
        return Stream.iterate(start, e -> e +1).limit(end-start+1).filter(e-> isOdd(e)).reduce( 0, Integer::sum);

    }

}
