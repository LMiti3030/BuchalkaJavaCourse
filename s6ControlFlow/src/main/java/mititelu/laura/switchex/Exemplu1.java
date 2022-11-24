package mititelu.laura.switchex;

public class Exemplu1 {

    public static void main(String[] args) {
        int switchValue = 3;

        switch (switchValue){
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3, 4, 5 -> {
                System.out.println("3/4/5");
                System.out.println(switchValue);
            }
            default -> System.out.println(switchValue);
        }

    }

    public static String getQuarter(String month){
        return switch (month.toUpperCase()){
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL","MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}
