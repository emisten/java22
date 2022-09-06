package java22;

public class Methods {

    public static void main(String[] args) {
        printMultiplicationTable(2);
        int x = 2;
        printMultiplicationTable(x);
        int tableNumber = 2;
        printMultiplicationTable(tableNumber);
        System.out.println(tableNumber);
        int sum = add(2, 3);
        System.out.println(sum);
        System.out.println(add(5,6));

        System.out.println("Tax");
        System.out.println(calculateTax(99999));
        System.out.println(calculateTax(110000));


      //  otherClass.printMessage();
      //  Math.random();
      //  Methods.random(); //behöver ej skriva Methods. eftersom det är i samma class
    }

    public static void printMultiplicationTable(int tableNumber){
        for (int i = 0; i <= 10; i++) {
            System.out.println(tableNumber * i);
        }
    }

    public static int add(int x, int y) {
        return x + y;
    }


    public static void random(){
        if( Math.random() > 0.5)
            return;
        System.out.println("Hej");
    }

    public static double calculateTax(double taxAmount){
        double amountOver =  taxAmount - 100000.0;
        //Use if to remove negative amounts
        if( amountOver < 0)
            amountOver = 0.0;
        //Or use Math.max instead for same result!
        amountOver = Math.max(amountOver,0.0);

        return taxAmount * 0.3 + amountOver * 0.1;
        }
        
        
    }
    
    


class otherClass {

    public static void printMessage(){
        System.out.println("Hello World");
    }
}