package se.iths.emilius.exercises.chapter6.vehicledealer;

import java.math.BigDecimal;

public abstract class Land extends Vehicle {

    private int kmDriven;

    public Land(int weight, BigDecimal price, Person owner) {super(weight, price, owner);}

    public void drive(int km){
        kmDriven += km;
    }
}
