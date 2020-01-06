package Week1;

import java.util.Scanner;

public class Exercise23Temperature {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Type a temperature! :)");
        Scanner reader = new Scanner(System.in);
        double temperature = Double.parseDouble(reader.nextLine());

        while(true){
            if(temperature > -30 && temperature < +40){
                System.out.println("The temperature is: " + temperature);
            } else {
                System.out.println("No se puede! :(");
            }
            break;
        }
    }
}
