package se.iths.emilius.exercises.chapter7;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();
        myStack.push("First string");
        myStack.push("Second string");
        myStack.push("Third string");
        System.out.println(myStack.size()); //3
        System.out.println(myStack.pop());  //Third string
        System.out.println(myStack.pop());  //Second string
        System.out.println(myStack.pop());  //First string

        //      myStack.print();
        //      myStack.printReversed();


        System.out.println(myStack.size()); //0
        System.out.println(myStack.isEmpty()); //True

        System.out.println(myStack.pop());


    }
}
