package se.iths.emilius.exercises.chapter6.vehicledealer;

import java.math.BigDecimal;
import java.util.Random;

public abstract class Marine extends Vehicle {

    private Random random = new Random();
    private double eastingGps;
    private double northingGps;


    public void go (){
        eastingGps = random.nextDouble(-180, 181);
        eastingGps = Math.max(eastingGps, 180);
        northingGps = (random.nextDouble(-90, 91));
        northingGps = Math.min(northingGps, 180);
        System.out.printf("Position is in easting %.6f", eastingGps);
        System.out.printf(" and in northing %.6f", northingGps);
    }


    public Marine(int weight, BigDecimal price, Person owner) {
        super(weight, price, owner);
    }
}
