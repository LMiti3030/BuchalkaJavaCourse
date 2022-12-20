package mititelu.laura.javamasterclass.challenges.arrays;

import java.util.Scanner;

public class MinimumElement {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of elements of the array: ");
        int number = scanner.nextInt();
        int[] array = readIntegers(number);
        int minimum = findMin(array);
        System.out.println("The minimum is: " + minimum);
    }

    public static int[] readIntegers(int number){
        int[] array = new int[number];
        for(int i = 0; i < array.length; i++ ){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array){
        int min = array[0];
        for(int i = 1; i <  array.length; i++){
            if( min > array[i]){
                min = array[i];
            }
        }
        return min;
    }

}
