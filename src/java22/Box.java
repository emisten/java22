package java22;

public class Box {
    int height;
    int width;
    int length;

    public Box(){

    }


    public void increaseBoxSize() {
        //Multiply all dimensions by 2
        this.length = this.length * 2;
        this.width = this.width * 2;
        this.height = this.height * 2;


    }

//    public void increaseBoxSize(){
//        height = height * 2;
//        width = width * 2;
//        length = length * 2;
//
//    }

    public void printBoxInfo(){
        System.out.println("Width: " + width );
        System.out.println("Height: " + height );
        System.out.println("Length: " + length );

    }

}
