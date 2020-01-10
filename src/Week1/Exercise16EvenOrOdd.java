package Week1;

import java.util.Scanner;
public class Exercise16EvenOrOdd {
    public static void main(String[] args) {
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Type your number: ");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println("Your number is even!");
            } else {
                System.out.println("Your number is odd!");
            }
        }
    }
}


