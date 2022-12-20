package mititelu.laura.javamasterclass.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {


    public static int[] getIntegers( int number ){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[number];
        for(int index = 0; index < number; index++){
            array[index] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int index = 0; index < array.length ; index++){
            System.out.println("Element  " + index + " contents " + array[index]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int[] sortedArray =  Arrays.copyOf(array, array.length);
        boolean isUnsorted ;
        do {
            isUnsorted = false;
            for (int index = 0; index < array.length - 1; index++) {
                if (sortedArray[index] < sortedArray[index + 1]) {
                    int temp = sortedArray[index + 1];
                    sortedArray[index + 1] = sortedArray[index];
                    sortedArray[index] = temp;
                    isUnsorted = true;
                }
            }
        }while(isUnsorted);
        return  sortedArray;
    }

}
