package Week1;

import java.util.Scanner;

public class Exercise8Adder {
    public static void main(String[] args) {
        System.out.println();
        Scanner reader = new Scanner(System.in);
        System.out.println("Introdu primul numar!");
        int number = Integer.parseInt(reader.nextLine());
        System.out.println("Introdu al doilea numar!");
        int number2 = Integer.parseInt(reader.nextLine());
        System.out.println("Rezultatul este:  " +(number + number2));

    }
}
