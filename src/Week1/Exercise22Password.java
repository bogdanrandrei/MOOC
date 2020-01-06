package Week1;

import java.util.Scanner;

public class Exercise22Password {
    public static void main(String[] args) {
        System.out.println("Hello! Please type a password! :)");
        Scanner reader = new Scanner(System.in);
        String rightPassword = "carrot";

        while (true){
            System.out.println("Type the password: ");
            String passwordTyped = reader.nextLine();
            if (passwordTyped.equalsIgnoreCase(rightPassword)) {
                System.out.println("The password is correct! :)");
                System.out.println("You do not have yo eat carrots, thought, the secret message is: Congratulations! You can program! ");
                break;
            } else {
                System.out.println("Wrong password!");
            }
        }
    }
}
