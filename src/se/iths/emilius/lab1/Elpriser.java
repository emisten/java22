package se.iths.emilius.lab1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Elpriser {

    static Scanner scanner = new Scanner(System.in);

    static HourlyPrice[] hourlyPrices = new HourlyPrice[24];


    public static void main(String[] args) {


        boolean run = true;
        while (run) {
            printMenu();
            String chooseentry = scanner.nextLine().toUpperCase();


            switch (chooseentry) {
                case "1":
                    inputPrices();
                    break;
                case "2":
                    minMaxAverage();
                    break;

                case "3":
                    System.out.println("Billigast till dyrast pris: ");
                    sortPrices();
                    break;

                case "4":
                    System.out.println("Bästa laddningstid 4 timmar isträck: ");
                    break;

                case "E":
                    run = false;
                    System.out.println("Exited the program");
                    break;


            }

        }

    }

    private static void printMenu() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Elpriser");
        System.out.println("========");
        System.out.println("1. Inmatning");
        System.out.println("2. Min, max och Medel");
        System.out.println("3. Sortera");
        System.out.println("4. Bästa Laddningstid");
        System.out.println("e. Avsluta");
    }

    private static void inputPrices() {

        System.out.println("Mata in priserna under dygnet");
        for (int i = 0; i < 24; i++) {
            System.out.printf("Vad är priset timme %02d-%02d?%n", i, i + 1);
            int price = scanner.nextInt();
            HourlyPrice hourlyPrice = new HourlyPrice(price, i);
            hourlyPrices[i] = hourlyPrice;


        }
    }


    private static void minMaxAverage() {

        Arrays.sort(hourlyPrices, Comparator.comparingInt(o -> o.price));

        int sum = 0;
        for (HourlyPrice currentPrice : hourlyPrices) {
            sum += currentPrice.price;

        }
        int average = sum/24;



        System.out.printf("Lägsta pris kl: %02d-%02d %d öre%n", hourlyPrices[0].hour, hourlyPrices[0].hour + 1, hourlyPrices[0].price);
        System.out.printf("Högsta pris kl: %02d-%02d %d öre%n", hourlyPrices[23].hour, hourlyPrices[23].hour + 1, hourlyPrices[23].price);
        System.out.printf("Dygnets medelpris är: %d öre%n", average);


    }


    private static void sortPrices() {

        Arrays.sort(hourlyPrices, Comparator.comparingInt(o -> o.price));
        for (HourlyPrice price : hourlyPrices) {
            String hour = String.format("%02d-%02d", price.hour, price.hour + 1);
            System.out.println(hour + " " + price.price + " öre");
        }


    }

    private static void cheapestHours() {

    }


}