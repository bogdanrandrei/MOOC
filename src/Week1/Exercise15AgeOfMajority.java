package Week1;

import java.util.Scanner;

public class Exercise15AgeOfMajority {
    public static void main(String[] args) {
        System.out.println("Ce varsta ai?");
        Scanner reader = new Scanner(System.in);
        int age = Integer.parseInt(reader.nextLine());

        if (age > 18) {
            System.out.println("Ai peste 18 ani! Esti major");
        } else {
            System.out.println("Nu ai peste 18 ani. Nu esti major!");
        }
    }
}