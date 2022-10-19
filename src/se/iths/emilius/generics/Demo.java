//package se.iths.emilius.generics;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Demo {
//
//    public static void main(String[] args) {
//
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        arrayList.add(123);
//
//
//
//
//
//
//        Pair <String, Double> twoStrings = readTwoStrings();
//
//        System.out.println(twoStrings);
//        System.out.println(twoStrings.first.length());
//        System.out.println(twoStrings.second.intValue());
//
//
//        String [] twoStringInArray = readTwoStringsAsArray();
//        System.out.println(Arrays.toString(twoStringInArray));
//
//        System.out.println(readTwoStringsAsRecord());
//    }
//
//    public static Pair<String,Double> readTwoStrings(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a string: ");
//        String stringOne = scanner.nextLine();
//        System.out.println("Enter a second string: ");
//        Integer stringTwo = scanner.nextInt();
//
//        return
//    }
//
//    public static String[] readTwoStringsAsArray(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a string: ");
//        String stringOne = scanner.nextLine();
//        System.out.println("Enter a second string: ");
//        String stringTwo = scanner.nextLine();
//
//        return new String[]{stringOne, stringTwo};
//    }
//
//
//    public static TwoValues readTwoStringsAsRecord(){
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a string: ");
//        String stringOne = scanner.nextLine();
//        System.out.println("Enter a second string: ");
//        String stringTwo = scanner.nextLine();
//
//        return new TwoValues(stringOne, stringTwo);
//
//    }
//
//    public static void printAPair(Pair<?, ?> thePair){
//        System.out.println(thePair);
//    }
//
//
//}
//
//record TwoValues(String first, String second){
//
//}
//
//record StringAndInteger(String first, Integer second){}
//
//
//
