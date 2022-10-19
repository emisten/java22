package se.iths.emilius.Shapes;

import java.util.Arrays;

public class Circle {
   private final int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public Circle(Circle circle){
        this.radius = circle.radius;
    }

    public Circle copyOf(){
        return new Circle(this);
    }


    public int getRadius() { return radius;}

    public double getArea(){
        return radius * radius * Math.PI;
    }

    //@Override
   // public String toString() {
      //  return "This is the circle with radius = " + radius;
    //}


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public static void main(String[] args) {

        Circle circle = new Circle(10);
        Object object = circle;
        Cylinder cylinder = new Cylinder(2,5);

        System.out.println(circle.toString());
        System.out.println(object.toString());
        System.out.println(cylinder.toString());




//        Circle c = new Circle(42);
//        Circle refc = c;
//        Circle copyOfC = new Circle(c);
//        Circle secondCopy = c.copyOf();

//        c.radius++;
//        System.out.println("c.radius = " + c.getRadius());
//        System.out.println("refc.radius = " + refc.getRadius());
//        System.out.println("copyOfC.radius = " + copyOfC.getRadius());

//         int[] array = {1,2,3};
//
//         int[] copyOfArray = new int[array.length];
//
//        for (int i = 0; i < array.length ; i++) {
//            copyOfArray[i] = array[i];
//        }
//        array[0] = 7;
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(copyOfArray));


    }


}
