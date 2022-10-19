package se.iths.emilius.exercises.chapter7;

import se.iths.emilius.exercises.animals.Animal;
import se.iths.emilius.exercises.chapter6.vehicledealer.*;

import java.math.BigDecimal;

public class Trio<T1 extends Land, T2 extends Marine, T3 extends Airborne>{

    public T1 var1;
    public T2 var2;
    public T3 var3;

    public Trio(T1 var1, T2 var2, T3 var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    public static void main(String[] args) {
        Person stina = new Person("Stina", 35, "Bank Robber", new BigDecimal(99999999));
        Trio<Car, Boat, Helicopter> trioOfVehicles = new Trio<>(
                new Car(2200, BigDecimal.valueOf(39999), stina),
                new Boat(2200, BigDecimal.valueOf(39999), stina),
                new Helicopter(2200, BigDecimal.valueOf(39999), stina));
    }

}
