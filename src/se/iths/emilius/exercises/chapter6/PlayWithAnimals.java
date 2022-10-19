package se.iths.emilius.exercises.chapter6;

import se.iths.emilius.exercises.chapter6.Animal;

public class PlayWithAnimals {

    public static void main(String[] args) {
        Animal dog = new Animal(50, 40, "Woof");
        Animal cat = new Animal(20, 30, "Meow");
        Animal ostrich = new Animal(200, 170, "BRRAAAAAAK");

        dog.printAnimal();
        cat.printAnimal();
        ostrich.printAnimal();

    }
}
