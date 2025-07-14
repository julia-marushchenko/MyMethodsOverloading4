// Java program to demonstrate methods overloading

package com.methods;

// Main class
public class Main {

    // Method print(String name, String greeting) to print greeting and name to console
    public void print(String name, String greeting){
        System.out.println(greeting + ", " + name + ".");
    }

    // Method print(String name, String greeting) to print greeting and name to console
    public void print(String name, String greeting, String information){
        System.out.println(greeting + ", " + name + ". " + information);
    }

    // Main method to run java program
    public static void main(String[] args) {

        // Creating Main instance
        Main m = new Main();

        // Calling method print() with two arguments
        m.print("Jack", "Hello");

        // Calling method print() with two arguments
        m.print("Jane", "Hi");

        // Calling method print() with three arguments
        m.print("Elizabeth", "Hello", "You are welcome!");

        // Calling method print() with three arguments
        m.print("Holly", "Good morning", "Have a nice day!");
    }
}