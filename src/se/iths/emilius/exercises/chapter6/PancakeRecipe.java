package se.iths.emilius.exercises.chapter6;

import java.sql.SQLOutput;

public class PancakeRecipe {
    int flour = 7;
    int milk = 6;
    int egg = 8;
    int salt = 6;
    int butter = 8;

    public boolean canMakePancakes() {
        return flour > 0 && milk > 0 && egg > 0 && salt > 0 && butter > 0;
    }

    public void makePancakes() {

        while (canMakePancakes()) {
            flour--;
            milk--;
            egg--;
            salt--;
            butter--;
            System.out.println("A pancake is ready!");

        }
        System.out.println("No more ingredients");
//        if (canMakePancakes()) {
//            flour--;
//            milk--;
//            egg--;
//            salt--;
//            butter--;
//            System.out.println("One pancake is ready!");
//            makePancakes();
//        } else {
//            System.out.println("No more ingredients");
//        }
    }

    public static void main(String[] args) {
        PancakeRecipe pancakeRecipe = new PancakeRecipe();
        pancakeRecipe.makePancakes();
    }

}