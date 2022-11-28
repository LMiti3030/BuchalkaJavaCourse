package mititelu.laura.switchex;

public class Exercise13NumberInWord {

    public static void printNumberInWord( int no){
        String output = switch (no){
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";
        };
        System.out.println(output);
    }

    public static void printNumberInWordOldSwitch( int no){
        switch (no){
            case 0 : System.out.println("ZERO");break;
            case 1 : System.out.println("ONE");break;
            case 2 : System.out.println("TWO");break;
            case 3 : System.out.println("THREE");break;
            case 4 : System.out.println("FOUR");break;
            case 5 : System.out.println("FIVE");break;
            case 6 : System.out.println("SIX");break;
            case 7 : System.out.println("SEVEN");break;
            case 8 : System.out.println("EIGHT");break;
            case 9 : System.out.println("NINE");break;
            default : System.out.println("OTHER");break;
        };
    }
}
