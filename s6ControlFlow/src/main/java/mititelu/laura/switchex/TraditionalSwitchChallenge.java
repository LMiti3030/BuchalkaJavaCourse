package mititelu.laura.switchex;

public class TraditionalSwitchChallenge {

    /**Using the NATO alphabet to replace a character or letter
     * with NATO's standardizes word for that letter
     * NATO PHONETIC ALPHABET
     * A - Able, B - Baker, C - Charlie, D - Dog, E - Easy
     * F - Fox, G - George, H - How, I - Item, J -Jig
     * K - King, L - Love, M - Mike, N - Nan, O - Oboe
     * P - Peter, Q - Queen, R - Roger, S - Sugar, T - Tare
     * U - Uncle, V - Victor, W - William, X - X-ray, Y - Yoke, Z - Zebra
     *
     * Just for letters A-E
     */

    public static String getNatoAlphabetUsingTraditionalSwitch(char c){

        switch (c){
            case 'A': case 'a': return "Able";
            case 'B': case 'b': return "Baker";
            case 'C': case 'c' : return "Charlie";
            case 'D': case 'd': return "Dog";
            case 'E': case 'e': return "Easy";
            default: return c + " not found";
        }
    }

}
