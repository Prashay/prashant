package Exceptionhandling;

import java.util.Scanner;

class invalidAgedException extends Exception {
    invalidAgedException(String s) {
        super(s);
    }
}

public class RRException {
    static void validte(int age) throws invalidAgedException {

        if (age < 19) {
            throw new invalidAgedException("age is not valid");
        } else {
            throw new invalidAgedException("age is valid");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter te age?");
        int age = sc.nextInt();
        try {
            validte(age);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
