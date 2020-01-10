package Week3;

import java.util.Scanner;

public class Exercise50SeparatingFirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String personName;
        System.out.print("Type your name: ");
        personName = reader.nextLine();

        if (personName.length() >= 3) {
            System.out.println("1. character: " + personName.charAt(0));
            System.out.println("2. character: " + personName.charAt(1));
            System.out.println("3. character: " + personName.charAt(2));
        }
    }
}

