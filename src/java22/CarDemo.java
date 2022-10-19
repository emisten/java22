package java22;

import java.awt.*;
import java.util.Objects;

public class CarDemo {

    public static void main(String[] args) {

        int i = 10;

        System.out.println(i);





        Car myCar = new Car(1700, new Color(200,0,0),185);

        //copying an object with copy constructor
        Car newCar = new Car(myCar);


        //Without a copy constructor we have to do like this
        //Will not work if we have private fields without getters
        Car newBadWayCar = new Car(myCar.getWeight(), myCar.getColor(), myCar.getMaxSpeed());


//    myCar.weight = 1700;
//    myCar.maxSpeed = 185;
//    myCar.color = new Color(100,100,100);

        System.out.println(myCar.maxSpeed());



        if (Objects.nonNull(myCar.getColor()))
         //   if (myCar.color != null)
                System.out.println(myCar.getColor().getRed());
    }
}
