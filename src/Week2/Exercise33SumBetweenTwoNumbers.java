package Week2;

import java.util.Scanner;

public class Exercise33SumBetweenTwoNumbers {
    public static void main(String[] args) {
        System.out.println();
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the lower limit number: ");
        int lowerLimit = Integer.parseInt(reader.nextLine());
        System.out.println("Type the upper limit number: ");
        int upperLimit = Integer.parseInt(reader.nextLine());
        int sum=0;

        while (lowerLimit <= upperLimit) {
            sum += lowerLimit;
            lowerLimit++;
        }
        System.out.println("Sum: " + sum);
    }
}

