package se.iths.emilius.exercises.chapter6.vehicledealer;

import java.math.BigDecimal;

public class VehicleDealer {
    public static void main(String[] args) {

        var firstSeller = new Seller("Harald", 25, "Java Developer", BigDecimal.valueOf(2034854));
        var secondSeller = new Seller("Bertil", 50, "Waste Management", BigDecimal.valueOf(2937253));
        var firstBuyer = new Buyer("Gunnar", 58, "Carpenter", BigDecimal.valueOf(100000000));
        var secondBuyer = new Buyer("Tony", 44, "Mailman", BigDecimal.valueOf(10000000));

        var originalBroker = new Broker("Hedinbil", 38, "Retailer", BigDecimal.valueOf(Integer.MAX_VALUE));

        Airplane airplane = new Airplane(20000, BigDecimal.valueOf(500000), firstSeller);
        var helicopter = new Helicopter(40203, BigDecimal.valueOf(7700000), firstSeller);
        var limousine = new Car(3000, BigDecimal.valueOf(1), secondSeller);


        originalBroker.sellVehicle(airplane, firstBuyer);
        originalBroker.sellVehicle(helicopter, firstBuyer);
        originalBroker.sellVehicle(limousine, secondBuyer);






    }
}
