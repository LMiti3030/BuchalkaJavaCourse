package mititelu.laura.console;

import java.util.Scanner;

public class MinMaxChallenge {

    /**
     * endless loop
     * prompts the user to enter a number or any character to quit
     * validates if the user-entered data really is a number, you can choose either an integer or double validation method
     * if user-entered data is not a number, quit the loop
     * keep track of the minimum number entered
     * keep track of the maximum number entered
     * at the end display the min and maximum
     */

    public static void main(String[] args) {

        //firstMethod();
        optimization();
    }

    private static void optimization() {
        Scanner scanner = new Scanner(System.in);

        double min = 0.0;
        double max = 0.0;
        int loopCount = 0;
        while(true){
            System.out.print("Enter a number, or any character to exit: ");
            String nextEntry = scanner.nextLine();
            try {
                double validNum = Double.parseDouble(nextEntry);
                if(loopCount == 0 || validNum < min){
                    min = validNum;
                }
                if(loopCount == 0 || validNum > max){
                    max = validNum;
                }
                loopCount++;
            }catch (NumberFormatException nfe){
                break;
            }
        }
        if(loopCount > 0){
            System.out.println("min = " + min + ", max = "+ max);
        } else {
            System.out.println("No valid data entered");
        }
    }

    private static void firstMethod() {
        Scanner scanner = new Scanner(System.in);

        boolean stop = false;
        double min = 0.0;
        double max = 0.0;
        int count = 0;
        do{
            System.out.print("Enter a number or any character to quit : ");
            try {
                double number = Double.parseDouble(scanner.nextLine());
                if(count == 0){
                    min = number;
                    max = number;
                }
                min = updateMin(min, number);
                max = updateMax(max, number);
                count ++;
            } catch (NumberFormatException e){
                stop = true;
            }
        }while (!stop);

        System.out.println("The minimum of the numbers entered is " + min);
        System.out.println("The maximum of the numbers entered is " + max);
    }

    public static double updateMin(double currentMin, double number){
        return (currentMin > number) ? number : currentMin;
    }

    public static double updateMax(double currentMax, double number){
        return (currentMax < number) ? number : currentMax;
    }

}
