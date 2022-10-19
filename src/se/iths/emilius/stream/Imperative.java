package se.iths.emilius.stream;

import java.util.List;
import java.util.stream.Stream;

public class Imperative {

    public static void main(String[] args) {

        List<String> stringList = List.of("A", "B", "C", "D", "E", "F");

        boolean containsA = stringList.contains("A");

        stringList.forEach(s -> System.out.println(s));

        for (String s : stringList) {
            System.out.println(s);
        }


        Stream<String> li = Stream.empty();

        stringList.stream()
                .limit(4)
                .skip(7)
                .reduce((s, s2) -> String.valueOf((char) Math.max(s.charAt(0), s2.charAt(0))))
                .ifPresent(System.out::println);

    }

}
