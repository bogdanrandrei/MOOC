package Week1;

import java.util.Scanner;

public class Exercise19AgeCheck {
    public static void main(String[] args) {
        System.out.println("How old are you?");
        Scanner reader = new Scanner(System.in);
        int age = Integer.parseInt(reader.nextLine());

        if (age < 0 || age >120) {
            System.out.println("Impossible!");
        }else {
            System.out.println("Your age is reasonable");
        }
    }
}
