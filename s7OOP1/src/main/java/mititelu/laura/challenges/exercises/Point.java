package mititelu.laura.challenges.exercises;

public class Point {

    private int x;
    private int y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(){
        return distance(0,0);
    }

    public double distance(int x, int y){
        return Math.sqrt( ( (x - this.x) * (x - this.x) ) +
                ( (y - this.y) * (y - this.y) ) );
    }

    public double distance(Point p){
        return distance(p.x, p.y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
