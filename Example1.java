package Assertion;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your age");

        int value = scanner.nextInt();
        assert value >= 18: "Invalid";

        System.out.println("Age is " + value);
    }
}
