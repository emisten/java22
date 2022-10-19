package se.iths.emilius.exercises.chapter6.vehicles;

public class Bicycle extends Vehicle{
    public Bicycle(String manufacturer, int productionYear) {
        super(manufacturer, productionYear);
    }

    @Override
    void goTo(String destination) {
        System.out.println("Cykeln färdas till " + destination);
    }
}
