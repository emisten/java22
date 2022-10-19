package se.iths.emilius.exercises.animals;

public class AnimalTest {

    public static void main(String[] args) {
        NoiseMaker noiseMaker1 = new Robot();
        NoiseMaker noiseMaker2 = new Crow(100, "craw", "Prelle");
        NoiseMaker noiseMaker3 = new Cow(20000, "Mu", "Rosa");

        noiseMaker1.makeNoise();
        noiseMaker2.makeNoise();
        noiseMaker3.makeNoise();
    }


}
