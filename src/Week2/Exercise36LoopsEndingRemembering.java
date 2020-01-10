package Week2;

import java.util.Scanner;

public class Exercise36LoopsEndingRemembering {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int suma = 0;
        int NumerePare = 0;
        int NumereImpare = 0;

        while (true) {
            System.out.print("Type the numbers: ");
            int number = Integer.parseInt(input.nextLine());
            if (number == -1) {
                System.out.println("Thank you and see you later!");
                break;
            } else {
                suma = suma + number;
                counter++;
            } if (number % 2 == 0) {
                NumerePare++;
            } else {
                NumereImpare++;
            }
        }
        double average = ((double) suma / counter);
        System.out.println("The sum is: " + suma);
        System.out.println("How many numbers: " + counter);
        System.out.println("The average is: " + average);
        System.out.println("How many odd numbers: " + NumereImpare);
        System.out.println("How many even numbers: " + NumerePare);
    }
}
