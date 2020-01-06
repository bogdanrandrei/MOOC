package Week1;

import java.util.Scanner;

public class Exercise17GreaterNumber {
    public static void main(String[] args) {
        System.out.println("Scrieti un prim numar!");
        Scanner reader = new Scanner(System.in);
        int numar1 = Integer.parseInt(reader.nextLine());
        System.out.println("Numarul pe care l-ar scris este: " + numar1);
        System.out.println("Scrieti al doilea numar!");
        Scanner reader2 = new Scanner(System.in);
        int numar2 = Integer.parseInt(reader.nextLine());
        System.out.println("Al doilea numar pe care l-ar scris este: " + numar2);

        if (numar1 > numar2) {
            System.out.println("Primul numar e mai mare decat al doilea.");
        } else if (numar1 < numar2) {
            System.out.println("Al doilea numar e mai mare decat primul.");
        } else if (numar1 == numar2){
            System.out.println("Numerele sunt egale!");
        }
    }
}
