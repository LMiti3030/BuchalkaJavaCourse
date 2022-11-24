package mititelu.laura.console;

import java.util.Scanner;

public class Exemplu1 {
    public static void main(String[] args) {
        int currentYear = 2022;
        try{
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e){
            //if we do not use the terminal, it will use the Scanner
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    //console

    /**
     * Does not work in IntelliJ
     * To make it work open the terminal in IntelliJ and run
     * java s6ControlFlow/src/main/java/mititelu/laura/console/Exemplu1.java
     * @param currentYear
     * @return
     */
    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi " + name);

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }

    //scanner
    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in); //InputStream
//        try {
//            Scanner scanFromFile = new Scanner(new File("nameOfFileOnFileSystem"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        System.out.println("Hi, What's your Name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name);

        boolean validDOB = false;
        int age = 0;
        do {
            System.out.println("Enter a year of birth >= "
                + (currentYear - 125) + " and <= " + currentYear );
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            } catch (NumberFormatException e){
                System.out.println("Characters not allowed!! Try again");
            }

        } while (!validDOB);

        return "So you are " + age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minYear = currentYear - 125;
        if((dob < minYear) || (dob > currentYear)){
            return -1; //-1 to describe an invalid value
        }
        return currentYear - dob;
    }
}
