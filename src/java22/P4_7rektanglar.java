package java22;

import java.util.Scanner;

public class P4_7rektanglar {


    public static void main(String[] args) {

 //       P4_7rektanglar.A();
//        P4_7rektanglar.B();
//        P4_7rektanglar.C();
//        P4_7rektanglar.D();
//        P4_7rektanglar.E();
//        P4_7rektanglar.F();
//        P4_7rektanglar.G();
//        P4_7rektanglar.H();
//        P4_7rektanglar.I();
//        P4_7rektanglar.J();
//        P4_7rektanglar.K();
  //      P4_7rektanglar.task4_7_j();
    }

    public static void A() {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 8; col++) {
                if (row == col)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println();
        }

    }

    public static void B() {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 8; col++) {
                if (col == row || col == row + 4)
                    System.out.print("#");
                else
                    System.out.print("-");

            }
            System.out.println("");

        }
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 8; x++) {
                if (x == y)
                    System.out.print("#");
                else if (x == (y + 4))
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }

    public static void C() {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 8; col++) {
                if (col == row || col == row + 1)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }

    public static void D() {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 8; col++) {
                if (col == 2 || col == 5 || row == 2)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }

    public static void E() {
        int x = 5;
        for (int row = 0; row < 4; row++) {
            x--;
            for (int col = 0; col < 8; col++) {
                if (row == col || col == x)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }

    public static void F() {
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 6; col++) {
                if ((col + row) % 2 == 0)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }

    public static void G() {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 6; col++) {
                if (col < 3 && row < 3)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }

    public static void H() {

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 8; col++) {
                if (col == row + 2)
                    System.out.print("#");
                else if (col > 5 && row < 2)
                    System.out.print("#");

                else
                    System.out.print("-");
            }

            System.out.println();
        }
    }

    public static void I() {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                if (col == 2 && row != 2)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }

    public static void J() {
        int x = 5;
        for (int row = 0; row < 5; row++) {
            x--;
            for (int col = 0; col < 5; col++) {
                if (col == row && row != 2)
                    System.out.print("#");
                else if (col == x && row != 2)
                    System.out.print("#");
                else if (col == 2 && row == 2)
                    System.out.print("o");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }











        public static void task4_7_j () {
            Scanner sc = new Scanner(System.in);
            System.out.println("""

                    Give me an uneven number

                    """);
            int rowSize = sc.nextInt();
            if (rowSize % 2 == 0) {
                System.out.println("""

                        You need to choose an uneven number

                        """);
                task4_7_j();
            }
            for (int row = 0; row < rowSize; row++) {
                System.out.println();
                for (int column = 0; column < rowSize; column++) {
                    if (column == row && column == rowSize - 1 - row)
                        System.out.print("o");
                    else if (column == row || column == rowSize - 1 - row)
                        System.out.print("#");
                    else
                        System.out.print("-");
                }
            }
            task4_7_j();
        }
    }