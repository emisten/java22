package se.iths.emilius.exercises.animals;

public class NullAnimal extends Animal {
    private static final Animal nullAnimal = new NullAnimal();


    @Override
    public void makeSound() {
        super.makeSound();
    }

    public NullAnimal(){
        super(0,"", "");
    }
}
