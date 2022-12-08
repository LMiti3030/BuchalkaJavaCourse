package mititelu.laura.javamasterclass.challenges.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = getIntegers();
        System.out.println("Unsorted array: ");
        printArray(array);
        System.out.println("Sorted array");
        printArray(sortIntegers(array));
    }


    public static int[] getIntegers(){
        System.out.print("Enter the number of elements of the array: ");
        int number = scanner.nextInt();
        int[] array = new int[number];
        for(int index = 0; index < number; index++){
            System.out.print("Enter " + index + " number: ");
            array[index] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int index = 0; index < array.length ; index++){
            System.out.println("Element at index " + index + " is: " + array[index]);
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
