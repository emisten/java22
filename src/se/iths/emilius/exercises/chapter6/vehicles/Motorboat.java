package se.iths.emilius.exercises.chapter6.vehicles;

public class Motorboat extends Boat {

    public Motorboat(String manufacturer, int productionYear){
        super(manufacturer, productionYear);
    }

    @Override
    public void goTo(String destination) {
        System.out.println("Motorbåten apsejsar vid " + destination);
    }
}

