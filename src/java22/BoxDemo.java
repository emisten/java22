package java22;

public class BoxDemo {

    public static void main(String[] args) {
        int i = 2;

        Box smallBox = new Box();
        smallBox.height = 10;
        smallBox.width = 5;
        smallBox.length = 10;
        smallBox.printBoxInfo();
        smallBox.increaseBoxSize();
        //increaseBoxSize(smallBox);
        smallBox.printBoxInfo();

    }

}
