package mititelu.laura.javamasterclass.challenges.arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    private static void reverse(int[] array){
        for(int i = 0; i < (array.length / 2) ; i++){
            int temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }

    }


}
