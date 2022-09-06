package java22;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Chapter1 {
    public static void main(String[] args) {
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String namn = scanner.next();
        //if (namn.equals("Kalle"))
        System.out.println("Hej " + namn + "!");
*/




/*
    Scanner scanner = new Scanner(System.in);
    System.out.println("Whats your name?");
    String name = scanner.next();

    System.out.println("Hey " + name + ", how old are you?");

    String age = scanner.next();
    int age1 = Integer.parseInt(age);
    System.out.println("Okey, you are " + age1 + " years old.");



    */

/*

    Scanner scanner = new Scanner(System.in);
        System.out.print("Write a whole number: ");
        int num1 = scanner.nextInt();
        System.out.print("Write another whole number: ");
        int num2 = scanner.nextInt();
        System.out.println("The sum of the two numbers are: " + (num1 + num2));
        System.out.println("The product of the two numbers are: " + num1*num2);
*/

/*

        Scanner sc = new Scanner(System.in);
        System.out.println("Write a decimal number");
        boolean isNumber = false;
        while (!isNumber){
            try {
                double decimalNumber = Double.parseDouble(sc.next());
                int doubleToInt = (int) decimalNumber;
                System.out.println("Your whole number is: " + doubleToInt);
                isNumber = true;
            } catch (Exception e) {
                System.out.println("Write a number: ");

            }
        }



*/

/*
    Scanner s = new Scanner(System.in);
        System.out.println("Write two numbers: ");
        int x = s.nextInt(), y = s.nextInt();

        double aver = (double) (x + y) / 2;
        System.out.println(aver);


*/

/*

        Scanner sc = new Scanner(System.in);
        System.out.println("How much money do you have on your account?");
        double sum = sc.nextDouble();
        System.out.println("How much % interest do you want?");
        double rent = sc.nextDouble();

        double saldo = sum + ((sum * rent) / 100);
        System.out.println(saldo);

        String s = sc.next();
        BigDecimal balance = new BigDecimal(s);
        BigDecimal interest = new BigDecimal("0,02");
        System.out.println(balance.multiply(interest));
        //BigDecimal should be used when it's about money

*/

/*

        String password = "1234";
        System.out.println("Write your password: ");
        char[] enteredPassword =System.console().readPassword();

        String enteredPasswordString = String.valueOf(enteredPassword);
        if (enteredPasswordString.equals(password)) {
            System.out.println("Correct Password!");
        } else {
            System.out.println("Wrong password!");
        }


*/

/*

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = sc.nextInt();

        if (number == 100)
            System.out.println("The number is exactly 100");

        else if (number <100) {
            //kan vara bra att (number <100) står innan number == 100, därför att det finns mer tal över 100 probably yeah
            System.out.println("The number is lesser than 100");
        } else {
            System.out.println("The number is greater than 100");
        }

*/

/*

        // Exercise 2.5
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();
        month = month.toLowerCase();
        switch (month) {
            case "january", "jan" -> System.out.println("1");
            case "february", "feb" -> System.out.println("2");
            case "march", "mar" -> System.out.println("3");
            default -> System.out.println("Something went wrong");





        }


*/

  /*      // Exercise 2.6
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Guess a number from 1 upto 10!");

        int answer = rand.nextInt(1, 11);

        int guess = sc.nextInt();
        int nGuesses = 1;
        while (guess != answer) {
            System.out.println("Wrong guess, guess again!");
            if (guess < answer) {
                    System.out.println("The number is higher than " + guess + "!");
            } else {
                    System.out.println("The number is higher " + guess + "!");
            }
            guess = sc.nextInt();
            nGuesses++;
            }
        System.out.println("Correect Guess, det var " + answer + "!");
        System.out.println("Number of guesses was: " + nGuesses);

*/

        // Exercise 2.7
 /*       for (int i = 1; i <=16 ; i++) {
            System.out.println(i);
        }
        int num = 1;
        while(num < 17) {
            System.out.println(num);
            num++;

        }


*/

        // Exercise 2.8
/*
        for (int i = 20; i >=2 ; i--) { // clearer to view, could be the best option for real for real ( it is the best option for real for real)
            if (isEven(i))
                System.out.println(i);
        }

        for (int i = 20; i >= 2; i = i - 2) { // a little bit more optimal
            System.out.println(i);

        }


*/

        // Exercise 2.9

/*
        int k = 2;
        System.out.println(k << k);
        // k = k * 2 * 2

        for (int i = 65536; i > 1; i /= 2) {
            System.out.println(i);
        }

        for (int i = 65536; i > 1; i >>= 1)
            System.out.println(i); // More optimal yeah


*/
        // Exercise 2.10
     /*   Scanner scanner = new Scanner(System.in);
        String completeInput = "";

        while(true){
            System.out.println("Write a word");
            String input = scanner.nextLine();
                if(input.isEmpty() || input.equals("."))
                    break;

                completeInput = completeInput + input + " ";
            System.out.println(completeInput);
        }




*/

/*
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number bigger than 3: ");

        long testNumber = sc.nextLong();
        while (true){
            if(testNumber < 3) {
                break;
            } else if (testNumber % 2 == 0)
                testNumber /= 2;
            else
                testNumber = testNumber * 3 + 1;
            System.out.println(testNumber);
        }




*/

        for (int i = 0; i < 10; i++) {
            if (i%2 == 0)
                continue;
            System.out.println(i);
        }







    }

    private static boolean isEven(int i) {
        return i % 2 == 0;
    }
}