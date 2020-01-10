package Week3;

import java.util.Scanner;

public class Exercise49LastLetter {
    public static char lastCharacter(String text){
        char lastCharacter = text.charAt(text.length() -1);
        return lastCharacter;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type name:");
        String name = reader.nextLine();
        System.out.println("Last character/letter from word is: "+lastCharacter(name));
    }
}
