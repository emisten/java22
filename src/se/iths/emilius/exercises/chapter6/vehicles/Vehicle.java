package se.iths.emilius.exercises.chapter6.vehicles;

abstract public class Vehicle {

    private String manufacturer;
    private int productionYear;

    public Vehicle(String manufacturer, int productionYear){
        this.manufacturer = manufacturer;
        this.productionYear = productionYear;
    }
    abstract void goTo (String destination);


}
