package Week2;

import java.util.Scanner;

public class Exercise32SumOfASerOfNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what?");
        int n = Integer.parseInt(reader.nextLine());
        int counter = 0, sum = 0;

        while(counter < n) {
            counter++;
            sum += counter;
        }
        System.out.println("Sum is: "+ sum);
        }
}

