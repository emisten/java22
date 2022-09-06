package java22;


public class Methods2 {

    public static void main(String[] args) {

        int a = sum(1,2);
        a = sum(1,2,3);
        a = sum(1,2.0);
        double b = sum(1.0,2.0);

        double c = sum(1.0,2.0);
        printIfGreaterThanTwo(c);
        test();
        int temp = createdMethod(1);

        recurse();

    }

    private static void recurse() {
        System.out.println("Hej");
        recurse();
    }

    private static int createdMethod(int i) {
        return 0;
    }

    private static void test() {

    }

    private static void printIfGreaterThanTwo(double value) {

    }


    public static int sum( int a, int b){
        return 0;
    }

    public static int sum( int a, int b, int e){
        return 0;
    }

    public static int sum(int a, double b){
        return 0;
    }



    public static double sum( double a, double b){
        return 0;
    }

   /* public static double sum( double a, double b) {
        return 0;
    }*/




}
