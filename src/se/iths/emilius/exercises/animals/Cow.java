package se.iths.emilius.exercises.animals;

public class Cow extends Mammal implements NoiseMaker {
    public Cow(int weight, String sound, String name) {
        super(weight, sound, name);
    }

    @Override
    public void makeNoise() {
        System.out.println("MUUUUUUUUUUU!!!");
    }
}
