package se.iths.emilius.Shapes;


import java.util.Scanner;

public class ShapesDemo {
    public static void main(String[] args) {

        final int i;

        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();

        System.out.println(i);



        Point point1 = new Point();
        Point point2 = new Point(1,1);
        Point point3 = new Point(point2);


        double distance = point1.distanceTo(point2);

        distance = Point.distance(point1,point2);


        System.out.println(distance);
        System.out.println(point1.getX());
        System.out.println(point1.getY());

        System.out.println(point1);

    }

}
