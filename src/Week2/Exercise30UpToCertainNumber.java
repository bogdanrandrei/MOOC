package Week2;

import java.util.Scanner;

public class Exercise30UpToCertainNumber {
    public static void main(String[] args) {
        System.out.println();
        Scanner reader = new Scanner(System.in);
        System.out.print("Up to what number? ");
        int limitNumber = Integer.parseInt(reader.nextLine());
        int startNumber = 1;

        while (startNumber <= limitNumber) {
            System.out.println(startNumber);
            startNumber++;
        }
    }
}

