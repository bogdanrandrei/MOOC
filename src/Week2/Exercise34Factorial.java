package Week2;

import java.util.Scanner;

public class Exercise34Factorial {
        public static void main (String[]args){
            Scanner reader = new Scanner(System.in);
            System.out.print("Type the number: ");
            int numarulprimit = Integer.parseInt(reader.nextLine());
            long fact = 1;
            int i = 1;
            while (i <numarulprimit ){
                fact = fact * i;
                i++;
            }
            System.out.println("Factorial is: " +fact);
        }
    }
