package Week1;

import java.util.Scanner;

public class Exercise20Username {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your username: ");
        String username = reader.nextLine();
        System.out.println("Type ypur password: ");
        String password = reader.nextLine();


        String  recognizedUsername1= "Alex";
        String  recognizedPassword1= "MightyDucks";
        String  recognizedUsername2= "Emily";
        String  recognizedPassword2= "Cat";

        if ((username.equalsIgnoreCase(recognizedUsername1) && (password.equalsIgnoreCase(recognizedPassword1))
                || (username.equalsIgnoreCase(recognizedUsername2) && (password.equalsIgnoreCase(recognizedPassword2))))) {
            System.out.println("You are now logged into the system!");
        }else {
            System.out.println("Your username or password was invalid!");
        }

    }
}
