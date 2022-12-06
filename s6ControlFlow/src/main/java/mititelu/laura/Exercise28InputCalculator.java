package mititelu.laura;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise28InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        long avg = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                int number = scanner.nextInt();
                sum +=number;
                count++;
            }catch(InputMismatchException e){
                break;
            }
        }

        if(count != 0){
            avg = Math.round((double)sum / count);
        }
        else{
            avg = 0;
        }

        System.out.println("SUM = "+ sum + " AVG = "+ avg);
    }
}
