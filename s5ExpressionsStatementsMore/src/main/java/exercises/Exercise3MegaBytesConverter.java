package exercises;

public class Exercise3MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if(kiloBytes < 0){
            System.out.println("Invalid value");
        }else {
            int megaBytes = kiloBytes / 1024;
            int remainingBytes = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingBytes + " KB" );
        }
    }

}
