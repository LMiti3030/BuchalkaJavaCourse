package mititelu.laura.console;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    /**
     * read 5 valid numbers from the console, entered by the user and print the sum of those five numbers
     * check valid integers
     * if not valid print invalid number + continue looping until you have 5 valid numbers
     * message Enter number #x: where x represents the count 1,2,3
     */

    public static void main(String[] args) {
        printSumOf5ValidNumbers();
    }

    public static void printSumOf5ValidNumbers() {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            boolean isValidNo = false;
            int no = 0;
            do {
                try {
                    System.out.println("Enter number #" + i + ":");
                    no = Integer.parseInt(scanner.nextLine());
                    isValidNo = true;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number");
                }
            } while (!isValidNo);
            sum+=no;
        }
        System.out.println("Sum of numbers entered is: " + sum);

    }
    public static void printSumOf5ValidDoubleNumbers() {
        double sum = 0;
        int i = 1;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Enter number #" + i + ":");
            String nextNumber = scanner.nextLine();
            try{
                double number = Double.parseDouble(nextNumber);
                i++;
                sum +=  number;
            } catch (NumberFormatException e){
                System.out.println("Invalid number");
            }
        } while (i <= 5);

        System.out.println("Sum of numbers entered is: " + sum);

    }

}
