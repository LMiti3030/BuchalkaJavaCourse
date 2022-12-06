package mititelu.laura;

public class Exercise25FlourPackProblem {

    private Exercise25FlourPackProblem(){}

    public static boolean canPack(int bigCount, int smallCount, int goal){

        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        int noBigInGoal = goal / 5;
        int remainderNoBigInGoal = goal % 5;
        if(noBigInGoal <= bigCount && remainderNoBigInGoal > smallCount){
            return false;
        }
        if(noBigInGoal > bigCount ){
            int diff = noBigInGoal - bigCount;
            if(((diff * 5) + remainderNoBigInGoal )> smallCount) {
                return false;
            }
        }
        return true;
    }
}
