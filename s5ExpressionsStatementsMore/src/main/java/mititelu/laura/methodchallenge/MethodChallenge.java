package mititelu.laura.methodchallenge;

public class MethodChallenge {

    public static void main(String[] args) {

        displayHighScorePosition("Laura", calculateHighScorePosition(1500));
        displayHighScorePosition("Ana", calculateHighScorePosition(1000));
        displayHighScorePosition("Adi", calculateHighScorePosition(500));
        displayHighScorePosition("Flori", calculateHighScorePosition(100));
        displayHighScorePosition("Nelu", calculateHighScorePosition(25));

    }

    private static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into the position "
                + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;
        //only one return statement makes code easier to follow
        //testing the boundaries!!
        //always look for ways to improve the code

        if ( score >= 1000 ) {
            position = 1;
        } else if ( score >= 500 ) {
            position = 2;
        } else if ( score >= 100 ){
            position = 3;
        }
        return position;
    }

}
