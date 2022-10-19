package se.iths.emilius.exercises.chapter6;

public class Animal {
  public int weight;
  public int height;
  public String sound;



    public void printAnimal(){
        System.out.println("The animal's weight is " + weight);
        System.out.println("The animal's height is " + height);
        System.out.println("The animal makes a " + sound + " sound!");
    }
    public Animal (int weight, int height, String sound){
        this.weight = weight;
        this.height = height;
        this.sound = sound;
    }

}

