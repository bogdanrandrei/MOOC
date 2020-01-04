package Week1;

import java.util.Scanner;

public class Exercise14AGreaterNumber {
    public static void main(String[] args) {
        System.out.println("Scrie un numar!");
        Scanner reader = new Scanner(System.in);
        int number = Integer.parseInt(reader.nextLine());

        if (number > 0) {
            System.out.println("Numarul e mai mare ca 0");
        } else {
                System.out.println("Numarul e mai mic ca 0");
        }
    }
}
