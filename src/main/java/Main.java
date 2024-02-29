/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        // create a new object of class Main
        compute();
        // call the compute() method on that new object
    }
    //Is writing the compute method outside of the main method the best way to write this?
    // I had to add "static" in order to be able to call compute in the main method.
    public static void compute() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        // Get input string of name from user

        if (name.equals("Alice") || name.equals("Bob")) {
            System.out.print("Hello " + name);
        }
        else {
            System.out.println("You are neither Alice nor Bob.");
        }
        // Create conditional to check name against Alice and Bob

        // Print greeting to screen if Alice or Bob are true
        
        // Print "You are neither Alice nor Bob." otherwise

    }
}
