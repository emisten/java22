package se.iths.emilius.exercises.chapter6;


import java.awt.*;

public class Car {
    private String model;
    private int price;
    private Color color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Car (){
        model = "Please give me a model: ";
        color = Color.BLACK; // This will give us the same black color object for all cars, less memory used
     // color = new Color(0,0,0);
        price = Integer.MAX_VALUE; //most EXPENSIVE CAR
    }

    public Car(String model, int price, Color color){
        this.color = color;
        this.price = price;
        this.model = model;
    }

   // public int halfPrice() {
        //return price/2;
   // }


    //This is a command method. Preferred return type is void from a method that updates our fields.
    //Methods returning field values should not update them.
    //This is called  Command-Query separation
    public void halfPrice(){
        price = price / 2;
    }

    public static void main(String[] args) {
        Car car = new Car("Model 3", 800000, Color.RED  );
//        System.out.println(car.halfPrice());
//        System.out.println(car.getPrice());

        car.halfPrice();
        System.out.println(car.getPrice());
    }


}
