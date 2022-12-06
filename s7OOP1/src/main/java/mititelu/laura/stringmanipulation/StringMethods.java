package mititelu.laura.stringmanipulation;

public class StringMethods {

    public static void main(String[] args) {
        String birthDate = "25/11/1982"; // format dd/mm/yyyy
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("Starting index = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));
        System.out.println("Month = " + birthDate.substring(3,5));

        String newDate = String.join("/", "25", "11", "1990");
        System.out.println("newDate = " + newDate);

        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("2000");
        System.out.println("newDate = " + newDate);

        newDate = "25"+"/"+"11"+"/"+"2010";
        System.out.println("newDate = " + newDate);

        newDate = "25".concat("/").concat("11").concat("/").concat("2020");
        System.out.println("newDate = " + newDate);

        System.out.println(newDate.replace('/', '-'));
        System.out.println(newDate.replace("2", "00"));
        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("/", "---"));

        System.out.println("new methods");
        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8)); //8 spaces at the start of every line
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2)); //-2 => removes 2 spaces at the start of every line
        System.out.println("-".repeat(20));




    }

}
