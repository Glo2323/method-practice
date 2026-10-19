package com.pluralsight;

public class Hello {

    //Make the main function
    public static void main(String[] args) {

        //calling the method to the screen
        sayHello();
        sayGoodbye();
        sayGoodMorning();
    }
     //make a  method called sayhello that prints out Hello world!

    public static void sayHello() {
        System.out.println("Hello World!");
    }

    //Make a method called sayGoodbye that prints out Goodbye
    public static void sayGoodbye() {
        System.out.println("Goodbye!");
    }

    //Make a method called sayGoodMorning that prints out Good Morning
    public static void sayGoodMorning() {
        System.out.println("Good Morning!");
    }

}
