package Week1;

import java.util.Scanner;

public class Exercise18GradesAndPoints {
    public static void main(String[] args) {
        System.out.println("Scrie un punctaj(points) intre 0 si 60");
        Scanner reader = new Scanner(System.in);
        int grade = Integer.parseInt(reader.nextLine());
        if (grade >=0 && grade <=29) {
            System.out.println("Grade:failed");
        } else if (grade >=30 && grade <=34) {
            System.out.println("Grade:1");
        }else if (grade >=35 && grade <=39){
            System.out.println("Grade:2");
        }else if (grade >=40 && grade <=44){
            System.out.println("Grade:3");
        }else if (grade >=45 && grade <=49){
            System.out.println("Grade:4");
        }else if (grade >=50 && grade <=60){
            System.out.println("Grade:5");
        }else if (grade >60){
            System.out.println("Eroare: punctajul trebuie sa fie maxim 60.");
        }
    }
}
