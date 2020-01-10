package Week2;

import java.util.Scanner;

public class Exercise38ManyPrintings {
    public static void main(String[] args) {
        System.out.println("ask the user how many times the text should be printed");
        System.out.println("How many times? :)");
        Scanner reader = new Scanner(System.in);
        int manyPrintings = Integer.parseInt(reader.next());
        int counter = 0;
        while (counter < manyPrintings){
            printText();
            counter++;
        }
    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}

