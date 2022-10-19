package se.iths.emilius.lambda;

public class CommandDemo {
    public static void main(String[] args) {

        Command firstCommand = new SwedishCommand();
        Command secondCommand = new EnglishCommand();
        Command thirdCommand = new Command() {
            @Override
            public void execute() {
                System.out.println("Hola desde Suecia!!!");
            }
        };
        Command fourthCommand = () -> System.out.println("Halo à Alba");

        handleCommand(fourthCommand);

        MathCalculation mathCalculation = Integer::sum;

        calculateAndPrint(mathCalculation);

        calculateAndPrint((number1, number2) -> number1 * number2);

        calculateAndPrint(CommandDemo::divide);

    }


    public static int divide(int a, int b) {
        return a / b;
    }




    private static void handleCommand(Command theCommand) {
        // System.out.println("This is handleCommand readyt ot execute the command.");
        theCommand.execute();
    }

    public static void calculateAndPrint(MathCalculation mathCalculation) {
        System.out.println(mathCalculation.calculate(2, 3));
    }
}
