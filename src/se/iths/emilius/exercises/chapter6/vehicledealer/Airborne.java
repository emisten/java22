package se.iths.emilius.exercises.chapter6.vehicledealer;

import java.math.BigDecimal;

public abstract class Airborne extends Vehicle{

    public Airborne(int weight, BigDecimal price, Person owner) {super(weight, price, owner);}

    private double altitude;
    public void fly(boolean isFlying) {
        if (isFlying)
            altitude += 200;
        else {
            System.out.println("Landing...");
             altitude = 0;
        }
    }
}
