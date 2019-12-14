package Week1;

import java.util.Scanner;

public class Exercise11BiggerNumber {
    public static void main(String[] args) {
        System.out.println("Scrie primul numar!");
        Scanner reader = new Scanner(System.in);
        int numar1 = Integer.parseInt(reader.nextLine());
        System.out.println("Scrie al doilea numar!");
        Scanner reader2 = new Scanner(System.in);
        int numar2 = Integer.parseInt(reader.nextLine());

        if (numar1 < numar2) {
             System.out.println(numar1);
            System.out.println("Numarul mai mare este:" + numar2);
        } else {
              System.out.println(numar2);
            System.out.println("Numarul mai mare este:" + numar1);
        }
    }
}
