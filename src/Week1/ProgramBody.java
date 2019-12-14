package Week1;

import java.util.Scanner;

public class ProgramBody {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Cum te cheama?");
        String nume = reader.nextLine();
        System.out.println("Salut!" + nume);
    }
}
