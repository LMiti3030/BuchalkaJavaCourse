package mititelu.laura.javamasterclass.challenges.encapsulation;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted; //managed by the class and not passed in the constructor
    private boolean duplex; //if true it can print on 2 sides of a single sheet of paper

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel < 0 || tonerLevel > 100) ? -1 : tonerLevel;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){

        int tempToner = tonerLevel + tonerAmount;
        if( tempToner> 100 || tempToner < 0){
            return -1;
        }else {
            tonerLevel += tonerAmount;
            return tonerLevel;
        }
    }

    public int printPages(int noPages){
        int jobPages = (duplex) ?  ( noPages / 2 ) + (noPages % 2) : noPages;
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
