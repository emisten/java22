package se.iths.emilius.exercises.chapter7;

import se.iths.emilius.exercises.animals.*;

import java.util.HashMap;
import java.util.Map;

public class AnimalCollection {

    public static void main(String[] args) {
        Map<String, Animal> firstHashMap = new HashMap<>();

        firstHashMap.put("Sten", new Cod(3, "blubblub", "Sten"));
        firstHashMap.put("Kaj", new Crow(4, "krakra", "Kaj"));
        firstHashMap.put("Harald", new Cow(188, "muu", "Harald"));
        firstHashMap.put("Halvor", new Crocodile(88, "rrrrrrrrwrwr", "Halvor"));

        firstHashMap.get("Halvor").makeSound();
        System.out.println(firstHashMap.size());

        firstHashMap.remove("Halvor");
        if (firstHashMap.containsKey("Halvor"))
            firstHashMap.get("Halvor").makeSound();

        firstHashMap.getOrDefault("Halvor", new Crocodile(12, "rr", "Halvor")).makeSound();


        System.out.println(firstHashMap.size());
    }
}
