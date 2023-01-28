package org.example.examples;

public class FizzBuzz {
    public static void main(String args[]) {
        System.out.println("The Fizz, Buzz, and FizzBuzz numbers are: ");
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.print("Fizz");
            } else if (i % 5 == 0) {
                System.out.print("Buzz");
            } else {
                System.out.print(i);
            }
            System.out.println("," + " ");
        }
    }
}
