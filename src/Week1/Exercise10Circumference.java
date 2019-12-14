package Week1;

import java.util.Scanner;

public class Exercise10Circumference {
    public static void main(String[] args) {
        System.out.println("Introduceti circumferinta cercului!");
        Scanner reader = new Scanner(System.in);
        int radius = Integer.parseInt(reader.nextLine());
        System.out.println(2 * Math.PI * radius);
    }
}
