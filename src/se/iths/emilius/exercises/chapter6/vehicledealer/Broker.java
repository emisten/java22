package se.iths.emilius.exercises.chapter6.vehicledealer;

import java.math.BigDecimal;

public class Broker extends Person {
    public Broker(String name, int age, String work, BigDecimal accountBalance) {
        super(name, age, work, accountBalance);
    }


    public void sellVehicle(Vehicle vehicle, Buyer buyer){


        var seller  = vehicle.getOwner();

        System.out.println(vehicle.getOwner().getName() + " äger fordonet och har " + vehicle.getOwner().getAccountBalance() + " på kontot");
        System.out.println(buyer.getName() + " har " + buyer.getAccountBalance() + " på kontot och köper fordonet från " + vehicle.getOwner().getName() + " för " + vehicle.getPrice());

        vehicle.getOwner().setAccountBalance(vehicle.getOwner().getAccountBalance());
        buyer.setAccountBalance(buyer.getAccountBalance().subtract(vehicle.getPrice()));
        vehicle.setOwner(buyer);
        System.out.println("Nu äger " + vehicle.getOwner().getName() + " fordonet och har " + vehicle.getOwner().getAccountBalance() + " på kontot");
        System.out.println(seller.getName() + " har nu " + seller.getAccountBalance() + " på kontot");


    }



}
