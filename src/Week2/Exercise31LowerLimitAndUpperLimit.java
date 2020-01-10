package Week2;

import java.util.Scanner;

public class Exercise31LowerLimitAndUpperLimit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the lower limit number: ");
        int lowerLimit = Integer.parseInt(reader.nextLine());
        System.out.println("Type the upper limit number: ");
        int upperLimit = Integer.parseInt(reader.nextLine());
        while (lowerLimit <= upperLimit) {
            System.out.println(lowerLimit);
            if (lowerLimit >= upperLimit) {
                System.out.println(upperLimit);
                    break;
                }
                lowerLimit++;
            }
        }
    }
