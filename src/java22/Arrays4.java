package java22;

public class Arrays4 {

    //  Exercise 1

    public static void main(String[] args) {

        String[] colors;
        colors = new String[5];
        colors[0] = "gul";
        colors[1] = "grön";
        colors[2] = "orange";
        colors[3] = "blå";
        colors[4] = "grå";

        for (String color : colors) {
            System.out.println("Färg i index " + ": " + color);
        }





        String[] coloring = {"gul", "grön", "orange", "blå", "grå"};
        for (int i = 0; i < coloring.length; i++) {
            System.out.println(colors[i]);

        }




}



}
