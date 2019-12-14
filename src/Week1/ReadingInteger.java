package Week1;

import java.util.Scanner;

public class ReadingInteger {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type an integer: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.println("You typed " + number);
    }
}
