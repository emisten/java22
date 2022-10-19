package se.iths.emilius.Shapes;

public class Point {
    private final int x;
    private final int y;
    private boolean writeProtected = false;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(Point other){
        this.x = other.x;
        this.y = other.y;
    }

    public double distanceTo(Point other){
        int deltaX = this.x - other.x;
        int deltaY = this.y - other.y;

        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);


    }



    public static double distance(Point point1, Point point2){

        int deltaX = point1.x -point2.x;
        int deltaY =  point1.y - point2.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }


    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }

}

