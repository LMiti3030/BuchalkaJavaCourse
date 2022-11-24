package mititelu.laura.floatingpoint;

public class Challenge {

    public static void main(String[] args) {
        //exPrimitives();

        //convert a given number of pounds to kg
        //1 pound is equal to 0.45359237 of a kg

        final double CONV_RATE = 0.45359237;
        double poundsValue = 200.0d;
        double kgValue = 5.0;
//        poundsValue = kgValue * CONV_RATE;
//        System.out.println(poundsValue + "pounds");
        kgValue = 200d * CONV_RATE;
        System.out.println(kgValue);
    }

    private static void exPrimitives() {
        int myValue = 5;
        System.out.println(myValue);
        float myFloatValue = 5f;
        System.out.println(myFloatValue);
        double myDoubleValue = 5d;
        System.out.println(myDoubleValue);

        myValue = 5/2;
        System.out.println(myValue); //result = 2
        myFloatValue = 5f/3f;
        System.out.println(myFloatValue); //result 1.6666666 (7 decimal )

        myDoubleValue = 5d/3d;
        System.out.println(myDoubleValue); //result 1.6666666666666667 (15 decimals)

        //one of the operands a double - result is a double

        //myFloatValue = 5.00 / 3f; => does not compile

        //double faster than float
        //prefer double
    }

}
