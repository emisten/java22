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
                case "1" -> inputPrices();
                case "2" -> minMaxAverage();
                case "3" -> sortPrices();
                case "4" -> cheapestHours();
                case "5" -> visualizePrices();
                case "E" -> {
                    run = false;
                    System.out.println("Exited the program");
                }
            }

        }

    }

    private static void printMenu() {
        System.out.println();
        System.out.println();
        System.out.println("Elpriser");
        System.out.println("========");
        System.out.println("1. Inmatning");
        System.out.println("2. Min, max och Medel");
        System.out.println("3. Sortera");
        System.out.println("4. Bästa Laddningstid");
        System.out.println("5. Visualisering");
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
        int average = sum / 24;


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

        Arrays.sort(hourlyPrices, Comparator.comparingInt(o -> o.hour));
        int cheapestHour = 0;
        int cheapestPrice = Integer.MAX_VALUE;


        for (int i = 0; i < 21; i++) {
            HourlyPrice currentHour = hourlyPrices[i];
            HourlyPrice secondHour = hourlyPrices[i + 1];
            HourlyPrice thirdHour = hourlyPrices[i + 2];
            HourlyPrice fourthHour = hourlyPrices[i + 3];

            int combinedPrice = currentHour.price + secondHour.price + thirdHour.price + fourthHour.price;
            if (combinedPrice < cheapestPrice) {
                cheapestHour = currentHour.hour;
                cheapestPrice = combinedPrice;
            }
        }

        System.out.printf("Börja ladda kl: %02d för det bästa laddningspriset. Medelpriset för de fyra bästa timmarna i sträck var : %d öre", cheapestHour, cheapestPrice / 4);


    }


    private static void visualizePrices() {

        Arrays.sort(hourlyPrices, Comparator.comparingInt(o -> o.price));


        int height = 6;
        int maxValue = hourlyPrices[23].price;
        int lowestValue = hourlyPrices[0].price;
        int increment = maxValue / height;
        int width = String.valueOf(maxValue).length();
        StringBuilder widthSb = new StringBuilder();
        for (int j = 0; j < width; j++) {
            widthSb.append(" ");
        }


        Arrays.sort(hourlyPrices, Comparator.comparingInt(o -> o.hour));


        for (int i = 0; i < height; i++) {
            int threshold = maxValue - (i * increment);
            StringBuilder sb = new StringBuilder();


            if (i == 0) {
                sb.append(maxValue);
            } else if (i == height - 1) {
                int lowestValueWidth = String.valueOf(lowestValue).length();
                int spacesToAdd = width - lowestValueWidth;
                for (int j = 0; j < spacesToAdd; j++) {
                    sb.append(" ");
                }
                sb.append(lowestValue);
            } else {
                sb.append(widthSb);
            }
            sb.append(" | ");
            for (int j = 0; j < 24; j++) {
                int currentValue = hourlyPrices[j].price;
                if (currentValue >= threshold) {
                    sb.append("x");
                } else {
                    sb.append(" ");

                }
                sb.append("  ");

            }

            System.out.println(sb);


        }

        System.out.println(widthSb + " | -----------------------------------------------------------------------");
        System.out.println(widthSb + " | 00 01 02 03 04 05 06 07 08 09 10 11 12 13 14 15 16 17 18 19 20 21 22 23");


    }

}