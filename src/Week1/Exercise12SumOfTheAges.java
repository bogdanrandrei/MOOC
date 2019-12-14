package Week1;

import java.util.Scanner;

public class Exercise12SumOfTheAges {
    public static void main(String[] args) {
        System.out.println("Cum te cheama?");
        Scanner reader = new Scanner(System.in);
        String nume1 = String.valueOf(reader.nextLine());
        Scanner reader1 = new Scanner(System.in);
        System.out.println("Cati ani ai," + nume1 +"?");
        int numar1 = Integer.parseInt(reader.nextLine());
        System.out.println("Salut " + nume1 + ", " + numar1 +  " ani!");

        System.out.println("Cum te cheama?");
        String nume2 = String.valueOf(reader.nextLine());
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Cati ani ai," + nume2 +"?");
        int numar2 = Integer.parseInt(reader.nextLine());
        System.out.println("Salut " + nume2 + ", " + numar2 +  " ani!");

        System.out.println("Salut, "+nume1 + " si " + nume2 + ", " +  "aveti" + (numar1+numar2) + " ani!");

    }
}
