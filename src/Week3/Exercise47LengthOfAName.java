package Week3;

import java.util.Scanner;

public class Exercise47LengthOfAName {
    public static int calculateCharacters(String text) {
        int length = text.length();
        return length;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a name!");
        String NumeIntrodus = reader.nextLine();
        System.out.println("Number of characters is:" + calculateCharacters(NumeIntrodus));
    }
}
